package oop.demo_4;

//目标：理解this关键字的作用
public class test {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.run();
        System.out.println(c1);
        System.out.println("-------------");

        Car c2 = new Car("宝马",80.4);
        System.out.println(c2.name);
        System.out.println(c2.price);
        c2.goWith("奥迪");
    }
}
