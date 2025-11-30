package io.github.rodrigocorreiainf.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class Exercise {

    @Id
    private String id;

    private String name;

    private List<ExerciseSet> exerciseSets;

    public Exercise() {
    }

}
