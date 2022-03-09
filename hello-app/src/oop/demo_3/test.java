package oop.demo_3;

public class test {
    public static void main(String[] args) {
        //通过调用构造器得到对象
        Car c = new Car();
        c.name = "奥迪";
        c.price = 20.5;
        System.out.println(c.name);
        System.out.println(c.price);

        //调用有参数构造器
        Car c2 = new Car("奔驰",59.4);
        System.out.println(c2.name);
        System.out.println(c2.price);
    }
}
