package izeic.diploma.kiberone.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private Integer phoneNumber;
    private Integer salary;
    @CreationTimestamp
    private LocalDateTime createdOn;

    public Employee() {
    }

    public Employee(Long id, String name, String surname, Integer phoneNumber, Integer salary, LocalDateTime createdOn) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.createdOn = createdOn;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
