package com.galvanize.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "races")
public class Race {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column
    String name;
    @Column
    String category;
    @Column
    Date date;
    @Column
    String bestTime;
    @Column
    Long winnerId;
    @ManyToOne
    Driver particpants;

    public Race() {
    }

    public Race(Long id, String name, String category, Date date, String bestTime, Long winnerId, Driver particpants){
        this.id = id;
        this.name = name;
        this.category = category;
        this.date = date;
        this.bestTime = bestTime;
        this.winnerId = winnerId;
        this.particpants = particpants;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBestTime() {
        return bestTime;
    }

    public void setBestTime(String bestTime) {
        this.bestTime = bestTime;
    }

    public Long getWinnerId() {
        return winnerId;
    }

    public void setWinnerId(Long winnerId) {
        this.winnerId = winnerId;
    }

    public Driver getParticpants() {
        return particpants;
    }

    public void setParticpants(Driver particpants) {
        this.particpants = particpants;
    }
}
