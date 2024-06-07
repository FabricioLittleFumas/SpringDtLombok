package com.SprinDataLombok.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SprinDataLombok.model.Noticia;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface NoticiaRepository extends CrudRepository<Noticia, Long> {

}
