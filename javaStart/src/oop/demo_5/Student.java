package oop.demo_5;

//封装
public class Student {
    //1.成员变量使用private修饰，只能在本类中访问
    private int age;

    //2.提供成套的getter和setter方法暴露其取值和赋值
    public void setAge(int age){
        if (age<0&&age>150)
            System.out.println("数据有误！！");
        else
            this.age = age;
    }
    public int getAge(){
        return age;
    }
}
