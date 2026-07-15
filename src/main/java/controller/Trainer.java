package controller;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Trainer {

    @Id
    private int t_id;

    @Column
    private String t_name;

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    @OneToMany
    List<Student> l1;
    public List<Student> getL1() {
        return l1;
    }

    public void setL1(List<Student> l1) {
        this.l1 = l1;
    }
}