package com.scc.repository;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.scc.model.Breeder;

@Repository
public interface BreederRepository extends CrudRepository<Breeder,String>  {
	
    public Breeder findByIdDog(int idDog);
    
    @Transactional
    public void deleteByIdDog(int idDog);
    
}

 