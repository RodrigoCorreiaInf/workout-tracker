package io.github.rodrigocorreiainf.service;

import io.github.rodrigocorreiainf.entity.Exercise;
import io.github.rodrigocorreiainf.entity.Workout;
import io.github.rodrigocorreiainf.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutService {

    @Autowired
    private WorkoutRepository workoutRepository;

    public Workout createWorkout(Workout workout) {
        return workoutRepository.save(workout);
    }

    public List<Workout> getAllWorkouts() {
        return workoutRepository.findAll();
    }

    public void deleteWorkout(String id) {
        workoutRepository.deleteById(id);
    }

    public Workout addExercise(String workoutId, Exercise exercise) {
        Workout workout = workoutRepository.findById(workoutId)
                .orElseThrow(() -> new RuntimeException("Workout with " + workoutId + "not found."));

        workout.getExercises().add(exercise);

        return workoutRepository.save(workout);
    }

}
