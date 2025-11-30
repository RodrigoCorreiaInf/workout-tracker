package io.github.rodrigocorreiainf.entity;

import lombok.Data;

@Data
public class ExerciseSet {

    private Integer setNumber;

    private Integer reps;

    private Double weight;

    public ExerciseSet() {
    }

}
