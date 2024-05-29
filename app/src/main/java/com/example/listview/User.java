package com.example.listview;

public class User {
    private String name;
    private  int age;
    private String job;

    public User(String n, int a, String j) {
        name = n;
        age = a;
        job = j;
    }

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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
