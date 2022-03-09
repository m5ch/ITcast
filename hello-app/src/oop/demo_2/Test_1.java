package oop.demo_2;

import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {
        //定义商品类
        //定义购物车对象，用一个数组对象表示
        Goods[] shopCar = new Goods[100];

        //搭建操作架构
        System.out.println("请选择操作:");
        System.out.print("添加商品:add" + "\t");
        System.out.print("查看商品:query" + "\t");
        System.out.print("修改商品:update" + "\t");
        System.out.print("结算:pay");

        Scanner sc = new Scanner(System.in);
        System.out.println();
        String command = sc.next();
        switch (command){
            case "add":
                addGoods(shopCar, sc);
                break;
            case "query":
                queryGoods(shopCar);
                break;
            case "update":
                updateGoods(shopCar);
                break;
            case "pay":
                payGoods(shopCar);
                break;

        }
    }


    //添加商品
    public static void addGoods(Goods[] shopCar, Scanner sc) {
        System.out.println("请输入商品编号（不重复）：");
        //录入信息
        System.out.println("输入编号：");
        int id = sc.nextInt();
        System.out.println("输入名称：");
        String name = sc.next();
        System.out.println("输入价格：");
        double price = sc.nextDouble();
        System.out.println("输入数量：");
        int buyNumber = sc.nextInt();

        //把购买信息封装成一个商品对象
        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.price = price;
        g.buyNumber = buyNumber;

        //把商品对象添加到购物车数组
        for (int i = 0; i < shopCar.length; i++) {
            
        }
    }

    //查看商品
    public static void queryGoods(Goods[] shopCar) {

    }

    //修改商品
    public static void updateGoods(Goods[] shopCar) {

    }

    //结算
    public static void payGoods(Goods[] shopCar) {

    }
}
