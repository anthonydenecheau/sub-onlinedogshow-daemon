package com.scc.sub.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scc.sub.model.Dog;

@Repository
public interface DogRepository extends CrudRepository<Dog,String>  {
	
    public Dog findById(int id);
    
    @Transactional
    public void deleteById(int id);
    
}