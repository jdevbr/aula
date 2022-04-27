package com.aula.aula_api.service;

import java.util.List;

import com.aula.aula_api.entity.Anniversary;
import com.aula.aula_api.repository.AnniversaryRepository;

import org.springframework.stereotype.Service;

@Service
public class AnniversaryService {
    
    final AnniversaryRepository repository;

    public AnniversaryService(AnniversaryRepository repository) {
        this.repository = repository;
    }

    public List<Anniversary> findAll(String creator) {
        return repository.findByCreator(creator);
    }

    public Anniversary save(String creator, Anniversary anniversary) {
        anniversary.setCreator(creator);
        return repository.save(anniversary);
    }

    public void delete(String creator, Long id) {
        repository.deleteByCreatorAndId(creator, id);
    }
}
