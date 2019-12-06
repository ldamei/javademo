package com.itdr.basic4.demo3;

public class Student implements Cloneable{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(){

    }

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
}
