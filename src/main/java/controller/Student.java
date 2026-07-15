package controller;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    private int s_id;

    @Column
    private String s_name;

    @ManyToOne
    @JoinColumn(name = "trainer_id")  // creates FK column in Student table
    private Trainer trainer;

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
}
