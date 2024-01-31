package izeic.diploma.kiberone.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Lesson {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer lessonNumber;
    private Date lessonDate;
    private String comment;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
