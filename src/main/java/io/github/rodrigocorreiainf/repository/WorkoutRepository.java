package io.github.rodrigocorreiainf.repository;

import io.github.rodrigocorreiainf.entity.Workout;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkoutRepository extends MongoRepository<Workout, String> {

}
