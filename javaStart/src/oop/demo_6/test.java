package oop.demo_6;

public class test {
    public static void main(String[] args) {
        //通过无参数构造器创建对象封装一个用户信息
        User u1 = new User();
        u1.setName("狐羽落");
        u1.setHeight(1.85);
        u1.setSalary(10000);
        System.out.println(u1.getName());
        System.out.println(u1.getHeight());
        System.out.println(u1.getSalary());

        System.out.println("-=-=-=-=-=-=-=");
        User u2 = new User("花粥",1.65,20000.5);
        System.out.println(u2.getName());
        System.out.println(u2.getHeight());
        System.out.println(u2.getSalary());
    }
}
