package basic;

//目标：表达式的自动类型转换规则
public class demo_2 {
    public static void main(String[] args) {
        byte a = 5;
        int b = 2;
        double c = 9.0;
        double res = a + b + c;
        System.out.println(res);
        System.out.println(a + b - 2.2);

        //面试题
        byte i = 100;
        byte j = 120;
        int re = i + j;
        System.out.println(re);
    }
}
