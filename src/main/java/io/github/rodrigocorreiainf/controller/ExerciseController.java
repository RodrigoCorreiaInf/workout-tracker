package io.github.rodrigocorreiainf.controller;

import io.github.rodrigocorreiainf.entity.Exercise;
import io.github.rodrigocorreiainf.service.ExerciseService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercises")
public class ExerciseController {

    @Autowired
    private ExerciseService service;

    @Operation(summary = "Create a new exercise")
    @PostMapping
    public Exercise createExercise(@RequestBody Exercise exercise) {
        return service.createExercise(exercise);
    }

    @Operation(summary = "Get all exercises")
    @GetMapping
    public List<Exercise> getAllExercises() {
        return service.getAllExercises();
    }

    @Operation(summary = "Get exercise by ID")
    @GetMapping("/{id}")
    public Exercise getExercise(@PathVariable String id) {
        return service.getExerciseById(id).orElse(null);
    }

    @Operation(summary = "Update exercise by ID")
    @PutMapping("/{id}")
    public Exercise updateExercise(@PathVariable String id, @RequestBody Exercise exercise) {
        return service.updateExercise(id, exercise);
    }

    @Operation(summary = "Delete exercise by ID")
    @DeleteMapping("/{id}")
    public void deleteExercise(@PathVariable String id) {
        service.deleteExercise(id);
    }

}
