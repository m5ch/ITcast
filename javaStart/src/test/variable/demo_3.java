package test.variable;

//目标：掌握使用基本数据类型定义不同的变量
public class demo_3 {
    public static void main(String[] args) {
        //1.byte字节型 1个字节 -128 ~ 127
        byte a = 127;
        System.out.println(a);
        //2.short短整型 2字节
        short b = 8579;
        System.out.println(b);
        //3.int整形 4个字节 （默认）
        int c= 9876454;
        System.out.println(c);
        //4.long长整型 8个字节
        long d = 9876543219878676L;
        /*注意:随便写一个整数字面量默认是int类型的，虽然没有超过long的范围，但是它超过了本身int类型的表示范围。
        如果希望随便写一个整数字面量当成long类型，需要在其后加L/l
         */
        System.out.println(d);
        //5. float单精度占4个字节
        //注意:随便写一个小数字面量默认是double类型,
        // 如果写一个小数字面量是float类型的需要在其后加上F / f
        float e = 99.9F;
        System.out.println(e);
        //6. double 双精度 8个字节
        double f = 123.456;
        System.out.println(f);
        //7.char字符型
        char ch = '中';
        System.out.println(ch);
        //8.布尔类型
        boolean s1 = true;
        System.out.println(s1);
        boolean s2 = false;
        System.out.println(s2);

        System.out.println("----------引用数据类型----------");

    }
}
