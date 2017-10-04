package com.capgemini.repositories;

import com.capgemini.model.Mens;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MensRepository extends CrudRepository<Mens, Integer>{

    List<Mens> findByLastName(String lastName);

}
