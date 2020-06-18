package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Azienda;

public interface AziendaRepository extends CrudRepository<Azienda, Integer> {

}