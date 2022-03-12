package opreator;

//目标：自增自减
public class demo_4 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i++);
        System.out.println(++i);
        System.out.println(--i);
        System.out.println(i--);
        System.out.println(i);
        System.out.println("----------拓展---------");
        int a = 10;
        int b = 5;
        int re = a++ + ++a - --b - ++b + 1 + a--;
        System.out.println(re);     //10 + 12 - 4 - 5 + 1 + 12 = 26
        System.out.println(a);      //10 11 12 11
        System.out.println(b);      //5 4 5
    }
}
