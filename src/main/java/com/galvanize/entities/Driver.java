package com.galvanize.entities;

import javafx.beans.value.ObservableBooleanValue;

import javax.persistence.*;

@Entity
@Table(name = "driver")
public class Driver{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column
    String firstName;
    @Column
    String lastName;
    @Column
    String nickname;
    @Column
    Integer age;
    @Column
    Integer win;
    @Column
    Integer loss;

    public Driver() {
    }

    public Driver(String firstName, String lastName, String nickname, Integer age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public Integer getLoss() {
        return loss;
    }

    public void setLoss(Integer loss) {
        this.loss = loss;
    }
}