package training.test.training1.entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Courses {
    private String id;
    private String name;


    @ManyToOne
    @JoinColumn(name = "id",nullable = false)
    private Enseignant enseignant;
}
