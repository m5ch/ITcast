package basic;

//目标：自动类型转换
public class demo_1 {
    public static void main(String[] args) {
        byte a1 = 12;
        int a2 = a1;
        System.out.println(a1);
        System.out.println(a2);

        int b1 = 9;
        double b2 = b1;
        System.out.println(b1);
        System.out.println(b2);

        char c1 = 'a';
        int c2 = c1;
        double c3 = c2;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
