package oop.demo_3;

//目标：认识构造器，了解两种构造器的作用
/*
注意事项；
1.任何类定义出来默认就自带了无参数构造器写不写都有
2.一旦定义了有参数构造器，此时就需要自己写无参数构造器
 */
public class Car {
    String name;
    double price;

    //无参数构造器:初始化对象时，成员变量的数据均采用默认值。
    public Car(){
        System.out.println("===无参数构造器被调用了===");
    }

    //有参数构造器:在初始化对象的时候，同时可以接收参数为对象进行赋值。
    public Car(String n, double p){
        System.out.println("===有参数构造器被调用了===");
        name = n;
        price = p;
    }
}
