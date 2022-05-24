package com.shrentseng.myclimbingjournal.TrainingLog;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * TrainingLogController
 */
@Entity
@Table(name="training_log")
public class TrainingLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat (pattern = "yyyy-MM-dd")
    private LocalDate date;

    @Column(name = "exercise_id", nullable = false)
    private Long exerciseId;

    @Column(name = "what_i_did", nullable = false)
    private String whatIDid;


    public TrainingLog() {
    }
    

    public TrainingLog(LocalDate date, Long exerciseId, String whatIDid) {
        System.out.println("yes");
        this.date = date;
        this.exerciseId = exerciseId;
        this.whatIDid = whatIDid;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", date='" + getDate() + "'" +
            ", exerciseId='" + getExerciseId() + "'" +
            ", whatIDid='" + getWhatIDid() + "'" +
            "}";
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getExerciseId() {
        return this.exerciseId;
    }

    public void setExerciseId(Long exerciseId) {
        this.exerciseId = exerciseId;
    }

    public String getWhatIDid() {
        return this.whatIDid;
    }

    public void setWhatIDid(String whatIDid) {
        this.whatIDid = whatIDid;
    }


    

}