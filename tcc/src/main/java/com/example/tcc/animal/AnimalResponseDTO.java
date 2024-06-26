package com.example.tcc.animal;

public record AnimalResponseDTO(Long id, String name, Integer age, String gender, String breed, String coatColor, String coatLength, String situation, String behavior, String observation) {
    public AnimalResponseDTO(Animal animal) {
        this(animal.getId(),
            animal.getName(),
            animal.getAge(),
            animal.getGender(),
            animal.getBreed(),
            animal.getCoatColor(),
            animal.getCoatLength(),
            animal.getSituation(),
            animal.getBehavior(),
            animal.getObservation()
        );
    }
}
