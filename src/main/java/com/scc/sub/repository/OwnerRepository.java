package com.scc.sub.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scc.sub.model.Owner;

@Repository
public interface OwnerRepository extends CrudRepository<Owner,String>  {
	
    public Owner findByIdDog(int idDog);
    
    @Transactional
    public void deleteByIdDog(int idDog);
    
}