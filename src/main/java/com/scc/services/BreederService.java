package com.scc.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.scc.model.Breeder;
import com.scc.model.Event;
import com.scc.repository.BreederRepository;

@Service
public class BreederService extends AbstractGenericService<Breeder> {

	private static final Logger logger = LoggerFactory.getLogger(BreederService.class);
	
	@Autowired
    private BreederRepository breederRepository;

    
	@Override
	protected void loggerSink(Event<Breeder> event) {

        logger.debug("Received a message of type {} ", event.getType());
        
        ObjectMapper mapper = new ObjectMapper();
        List<Breeder> breeders = mapper.convertValue(
        		event.getMessage(),
                new TypeReference<List<Breeder>>() { });
        
        for (Breeder breeder : breeders) {
	        switch(event.getAction()){
	            case "GET":
	                logger.debug("Received a {} event - breeder id {}", event.getAction(), breeder.getId());
	                break;
	            case "SAVE":
	            case "UPDATE":
	                logger.debug("Received a {} event - breeder id {}", event.getAction(), breeder.toString());
	                save(breeder, event.getTimestamp());
	                break;
	            case "DELETE":
	                logger.debug("Received a {} event - breeder id {}", event.getAction(), breeder.getId());
	                deleteByIdDog(breeder.getIdDog());
	                break;
	            default:
	                logger.error("Received an UNKNOWN event - bredder id {}", breeder.getId());
	                break;	        
	        }
        }

	}

	@Override
	protected void save(Breeder message, long timestamp) {

		try {
	    	Breeder breeder = breederRepository.findByIdDog(message.getIdDog());
	    	if (breeder == null) {
	    		logger.debug("breeder id {} not found", message.getId());
	    		message
	    			.withTimestamp(new Timestamp(timestamp))
	    		;	    		
	    		breederRepository.save(message);
	    	} else {
	    		logger.debug("save breeder id {}, {}, {}", breeder.getId(), breeder.getTimestamp().getTime(), timestamp);
	    		if (breeder.getTimestamp().getTime() < timestamp) {
		    		logger.debug("check queue OK ; call saving changes ");
		    		breeder
		    			.withId(message.getId())
		    			.withFirstName(message.getFirstName())
		    			.withLastName(message.getLastName())
		    			.withIdDog(message.getIdDog())
		    		    .withTypeProfil(message.getTypeProfil())
		    		    .withProfessionnelActif(message.getProfessionnelActif())
		    			.withRaisonSociale(message.getRaisonSociale())
		    			.withOnSuffixe(message.getOnSuffixe())
		    			.withTimestamp(new Timestamp(timestamp))
		    		;
		    		
		    		breederRepository.save(breeder);
	    		} else
		    		logger.debug("check queue KO : no changes saved");

	    	}
    	} finally {
    		
    	}
		
	}

	@Override
	protected void deleteById(long id) {
	}

	@Override
	protected void deleteByIdDog(int idDog) {

    	try {
    		breederRepository.deleteByIdDog(idDog);
    	} finally {
    		
    	}
		
	} 
	   
}
