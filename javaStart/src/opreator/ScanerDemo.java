package opreator;

//学会使用键盘录用技术

//1、导包
import java.util.Scanner;

public class ScanerDemo {
    public static void main(String[] args) {
        //2、得到键盘扫描器对象
        Scanner sc = new Scanner(System.in);
        System.out.println("年龄:");
        //3、调用sc对象的功能，等待用户输入数据
        //这个代码会等待用户输入数据，直到用户输入完并且按了回车键
        int age = sc.nextInt();
        System.out.println("姓名:");
        String name = sc.next();
        System.out.println("欢迎您" + name);
    }
}
