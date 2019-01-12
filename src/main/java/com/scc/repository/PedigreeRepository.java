package com.scc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scc.model.Pedigree;

@Repository
public interface PedigreeRepository extends CrudRepository<Pedigree,String>  {
	
	public Pedigree findById(long id);
	
    @Transactional
    public void deleteById(long id);
    
}
