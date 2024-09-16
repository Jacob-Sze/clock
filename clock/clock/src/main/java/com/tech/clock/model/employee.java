package com.tech.clock.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;


@Entity
public class employee implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private @Getter Long id;
    @Lob
    @Column(length = 1000000)
    private @Getter @Setter byte[] workHistory;
    private @Getter @Setter String name;
    private @Getter @Setter Long hourlyRate;
    public employee(){
        
    }
    public employee(byte[] workHistory, String name, Long hourlyRate){
        this.workHistory = workHistory;
        this.name = name;
        this.hourlyRate = hourlyRate;
    }
}
