package com.jcsbd.jcsbd.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "Squat")
public class Squat {
    @Id
    @Column
    private int id;

}
