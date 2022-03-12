package opreator;
//目标：拆分三位数，分别输出
public class demo_2 {
    public static void main(String[] args) {
        int res = 487;
        int a, b, c;
        //百位
        a = res / 100;
        //十位
        b = res / 10 % 10;
        //个位
        c = res % 10;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
