package opreator;

//目标：赋值运算符
public class demo_5 {
    public static void main(String[] args) {
        int a = 200, b = 10;
//        a += b;
        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a *= b);
        System.out.println(a /= b);
        System.out.println(a %= b);

        System.out.println("----------");
        byte i = 100;
        byte j = 20;
        i -= j;     //i = (byte)(i + j)
        System.out.println(i);
    }
}
