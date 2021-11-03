package com.fundamentals.entity;

import javax.persistence.*;

@Entity
public class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Player_Id")
    private  Integer id;

    @Column(name = "Player_Name", nullable = false)
    private String name;

    @Column(name = "Game")
    private String game;

    public PlayerEntity(){

    }

    public PlayerEntity(String name, String game){
        this.name = name;
        this.game = game;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", game=" + game +
                '}';
    }

}
