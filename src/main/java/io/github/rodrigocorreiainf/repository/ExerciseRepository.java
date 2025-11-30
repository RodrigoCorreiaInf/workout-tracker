package io.github.rodrigocorreiainf.repository;

import io.github.rodrigocorreiainf.entity.Exercise;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends MongoRepository<Exercise, String> {

}
