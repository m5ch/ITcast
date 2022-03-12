package oop.demo_4;

public class Car {
    String name;
    double price;
    public Car(){
        System.out.println("无参数构造器的this:" + this);
    }

    public Car(String name,double price){
        this.name = name;
        this.price = price;
    }

    public void run(){
        System.out.println("方法中的this:" + this);
    }

    public void goWith(String name){
        System.out.println(this.name+"正在和"+ name + "比赛~~");
    }

}
