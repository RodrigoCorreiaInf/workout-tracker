package io.github.rodrigocorreiainf.service;

import io.github.rodrigocorreiainf.entity.Exercise;
import io.github.rodrigocorreiainf.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExerciseService {

    @Autowired
    private ExerciseRepository repository;

    public Exercise createExercise(Exercise exercise) {
        return repository.save(exercise);
    }

    public List<Exercise> getAllExercises() {
        return repository.findAll();
    }

    public Optional<Exercise> getExerciseById(String id) {
        return repository.findById(id);
    }

    public Exercise updateExercise(String id, Exercise exercise) {
        exercise.setId(id); // ensure it updates the existing document
        return repository.save(exercise);
    }

    public void deleteExercise(String id) {
        repository.deleteById(id);
    }

}
