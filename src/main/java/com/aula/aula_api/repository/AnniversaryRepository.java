package com.aula.aula_api.repository;

import java.util.List;

import com.aula.aula_api.entity.Anniversary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnniversaryRepository extends JpaRepository<Anniversary, Long> {

    List<Anniversary> findByCreator(String creator);

    void deleteByCreatorAndId(String creator, Long id);
}