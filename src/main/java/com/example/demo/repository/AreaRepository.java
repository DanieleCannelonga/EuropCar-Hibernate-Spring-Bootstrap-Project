package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.Area;

public interface AreaRepository extends CrudRepository<Area, Integer> {

}