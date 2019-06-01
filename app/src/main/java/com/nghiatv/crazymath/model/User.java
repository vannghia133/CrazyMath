package com.nghiatv.crazymath.model;

/**
 * Created by user on 6/19/2018.
 */

public class User {
    private String name;

    private int score;

    public User(String name) {
        this.name = name;
        this.score = 0;
    }

    public void increaseScore() {
        score++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
