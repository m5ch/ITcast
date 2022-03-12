package oop.demo_6;

//javabean
public class User {
    //成员变量建议使用private私有
    private String name;
    private double height;
    private double salary;

    //2.为成员变量提供成套的getter和setter方法

    //要求提供无参数构造器，有参数构造器是可选的


    public User() {

    }

    public User(String name, double height, double salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
