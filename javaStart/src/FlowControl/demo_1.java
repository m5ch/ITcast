package FlowControl;

import java.util.Scanner;

//目标：if语句
public class demo_1 {
    public static void main(String[] args) {
        //格式1：if(条件表达式){代码……}
//        int a = 60;
//        if (a>100) {
//            System.out.println("牛逼");
//        }
        //格式2:if (){}else{}
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        if (i >= 520)
//            System.out.println("发送成功！！");
//        else
//            System.out.println("还是好好爱自己吧！！！");

        //格式3:if (){}else if(){} else{}
        Scanner qw = new Scanner(System.in);
        int score = qw.nextInt();
        if (score > 0 && score < 60)
            System.out.println("成绩为：D");
        else if (score >= 60 && score <70)
            System.out.println("成绩为：C");
        else if (score >= 70 && score< 80)
            System.out.println("成绩为：B");
        else if (score >= 80 && score <90)
            System.out.println("成绩为：A");
        else if (score >= 95 && score <= 100)
            System.out.println("成绩为：A+");
        else
            System.out.println("输入错误！！！");

    }
}
