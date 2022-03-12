package basic;

//目标：理解强制类型转换并使用
//注意:可能会造成数据（丢失）溢出！！！
public class demo_3 {
    public static void main(String[] args) {
        int a = 20;
        byte b = (byte) a;
        System.out.println(a);
        System.out.println(b);

        int i = 1200;
        byte j = (byte) i;
        System.out.println(i);
        System.out.println(j);

        double q = 22.2;
        int p = (int) q;
        System.out.println(q);
        System.out.println(p);
    }
}
