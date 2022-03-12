package test.variable;

//目标：理解变量使用的注意事项
public class demo_2 {
    public static void main(String[] args) {
        /*
        1、变量要先声明再使用
        2、变量声明后，不能存储其他类型的数据。
        3、变量的有效范围是从定义开始到"}”截止，且在同一个范围内部不能定义2个同名的变量。变量定义的时候可以没有初始值，但是使用的时候必须给初始值。
        */
        int a;
        System.out.println(a = 2);
        char sh = 65;
        System.out.println(sh);
    }
}