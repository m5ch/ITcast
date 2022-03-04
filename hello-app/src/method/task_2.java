package method;

import java.util.Scanner;

//买飞机票
/*
    需求:
    机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
    按照如下规则计算机票价格:旺季（5-10月）头等舱9折，经济舱8.5折，
    淡季（11月到来年4月）头等舱7折，经济舱6.5折。
 */
public class task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入机票原价:");
        double money = sc.nextDouble();
        System.out.print("请输入月份:");
        int month = sc.nextInt();
        switch (month){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:{
                System.out.print("请输入舱位:");
                String a = sc.next();
                switch (a){
                    case "头等舱":
                        money *= 0.9;
                        break;
                    case "经济舱":
                        money *= 0.85;
                        break;
                    default:
                        System.out.println("输入错误！");
                        money = -1;
                        break;
                }
                break;
            }
            case 11:
            case 12:
            case 1:
            case 2:
            case 3:
            case 4:{
                System.out.print("请输入舱位:");
                String a = sc.next();
                switch (a){
                    case "头等舱":
                        money *= 0.7;
                        break;
                    case "经济舱":
                        money *= 0.65;
                        break;
                    default:
                        System.out.println("输入错误！");
                        money = -1;
                        break;
                }
                break;
            }
        }
        System.out.println("最终票价是：" + money);
    }
}
