package com.jcsbd.jcsbd.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "DeadLift")
public class DeadLift {
    @Id
    @Column
    private int id;

}
