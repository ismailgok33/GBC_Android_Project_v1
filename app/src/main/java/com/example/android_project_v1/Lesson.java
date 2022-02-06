package com.example.android_project_v1;

public class Lesson {

    String name;
    int length; // will convert to hr and min later with a converter
    boolean isCompleted;

    public Lesson(String name, int length, boolean isCompleted) {
        this.name = name;
        this.length = length;
        this.isCompleted = isCompleted;
    }

    public String lengthConverter(int length) {
        if(length >= 60) {
            return (length / 60) + "hr " + (length % 60) + " min";
        }
        else {
            return (length % 60) + " min";
        }

    }

    @Override
    public String toString() {
        return name + "\n" + lengthConverter(length);
    }
}
