package io.github.rodrigocorreiainf.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "workouts")
@Data
public class Workout {

    @JsonIgnore
    @Id
    private String id;

    private String description;

    private List<Exercise> exercises;

    public Workout() {
    }

}
