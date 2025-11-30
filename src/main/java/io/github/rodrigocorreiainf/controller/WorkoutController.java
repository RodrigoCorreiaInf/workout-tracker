package io.github.rodrigocorreiainf.controller;

import io.github.rodrigocorreiainf.entity.Exercise;
import io.github.rodrigocorreiainf.entity.Workout;
import io.github.rodrigocorreiainf.service.WorkoutService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {

    @Autowired
    private WorkoutService workoutService;

    @Operation(summary = "Create a new workout")
    @PostMapping
    public Workout createWorkout(@RequestBody Workout workout) {
        return workoutService.createWorkout(workout);
    }

    @GetMapping
    public List<Workout> getAllWorkouts() {
        return workoutService.getAllWorkouts();
    }

    @DeleteMapping("/{id}")
    public void deleteWorkout(@PathVariable String id) {
        workoutService.deleteWorkout(id);
    }

    @PostMapping("/{id}/exercises")
    public Workout addExercise(@PathVariable String id, @RequestBody Exercise exercise) {
        return workoutService.addExercise(id, exercise);
    }

}
