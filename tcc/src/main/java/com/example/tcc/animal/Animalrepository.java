package com.example.tcc.animal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Animalrepository extends JpaRepository<Animal, Long> {
}
