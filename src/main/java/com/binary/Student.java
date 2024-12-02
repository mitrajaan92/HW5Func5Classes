package com.binary;

public class Student {
    private String name;
    private int age;
    private int grade;
    //    Default Constructor
    public Student(){

    }
    //    Parametrized Constructor
    public Student(String name, int age, int grade){
        this.name = name;
        this.age= age;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int isGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


}
