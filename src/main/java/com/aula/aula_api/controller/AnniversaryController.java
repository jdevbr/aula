package com.aula.aula_api.controller;

import java.util.List;

import com.aula.aula_api.entity.Anniversary;
import com.aula.aula_api.service.AnniversaryService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api")
public class AnniversaryController {
    
    final AnniversaryService service;

    public AnniversaryController(AnniversaryService service) {
        this.service = service;
    }
    
    @GetMapping("{creator}/anniversary")
    public List<Anniversary> findAll(@PathVariable String creator) {
        return service.findAll(creator);
    }

    @PostMapping("{creator}/anniversary")
    public Anniversary save(@PathVariable String creator, @RequestBody Anniversary anniversary) {
        return service.save(creator, anniversary);
    }

    @DeleteMapping("{creator}/anniversary/{id}")
    public void delete(@PathVariable String creator, @PathVariable Long id) {
        service.delete(creator, id);
    }
}
