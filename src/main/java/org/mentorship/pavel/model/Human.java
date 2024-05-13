package org.mentorship.pavel.model;

import java.util.Objects;

//todo: use it
public abstract class Human {

    private final int age;
    private final int height;
    private final int weight;

    public Human(int age, int height, int weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && height == human.height && weight == human.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, height, weight);
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
