package com.example.coffee.repository;

import com.example.coffee.model.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {

}
