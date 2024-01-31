package izeic.diploma.kiberone.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Group {
    @Id
    private Long id;
    private String locationAddress;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
