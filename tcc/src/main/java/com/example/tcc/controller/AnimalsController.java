package com.example.tcc.controller;

import com.example.tcc.animal.Animal;
import com.example.tcc.animal.AnimalResponseDTO;
import com.example.tcc.animal.Animalrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("animal")
public class AnimalsController {
    @Autowired
    private Animalrepository animalrepository;

    @GetMapping
    public List<AnimalResponseDTO> getAll() {
        List<AnimalResponseDTO> animalList = animalrepository.findAll().stream().map(AnimalResponseDTO::new).toList();
        return animalList;
    }

}
