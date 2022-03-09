package oop.demo_1;

public class test_1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.name = "奥迪";
        c.price = 20;
        System.out.println(c.name);
        System.out.println(c.price);
        c.start();
        c.run();
    }
}
