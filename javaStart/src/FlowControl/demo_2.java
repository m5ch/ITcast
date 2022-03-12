package FlowControl;

import java.util.Scanner;

//目标：switch分支结构
/*
表达式类型只能是byte、short、int、char，枚举，String、不支持double、float、long.
case给出的值不允许重复，且只能是字面量，不能是变量。
不要忘记写break，否则会出现穿透现象。
 */
public class demo_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        /*
        周一:埋头苦干，解决bug
        周二:请求大牛程序员帮忙
        周三:今晚啤酒、龙虾、小烧烤
        周四:主动帮助新来的女程序解决bug
        周五:今晚吃鸡
        周六:与王婆介绍的小芳相亲
        周目:郁郁寡欢、准备上班。
         */
        switch(a){
            case "周一":
                System.out.println("埋头苦干，解决bug");
                break;
            case "周二":
                System.out.println("请求大牛程序员帮忙");
                break;
            case "周三":
                System.out.println("今晚啤酒、龙虾、小烧烤");
                break;
            case "周四":
                System.out.println("主动帮助新来的女程序解决bug");
                break;
            case "周五":
                System.out.println("今晚吃鸡");
                break;
            case "周六":
                System.out.println("与王婆介绍的小芳相亲");
                break;
            case "周日":
                System.out.println("郁郁寡欢、准备上班。");
                break;
            default:
                System.out.println("输入有错！！");
        }
    }
}
