package opreator;

//目标：逻辑运算符
//三元运算符
//运算符优先
public class demo_7 {
    public static void main(String[] args) {
        double score = 90;
        System.out.println(score >= 60 ? "通过" : "不通过");

        int a = 10, b = 20;
        int c = a > b ? a : b;
        System.out.println(c);

        System.out.println("-----------------------");
        int i = 10,j = 11, k = 30;
        int temp = i>j?i:j;
        int rs = temp>k?temp:k;
        System.out.println(rs);

        int re;
//        re = (i>j?i:j)>(i>k?i:k)?(i>j?i:j):(i>k?i:k);
        re = i>j? i>k?i:k :j>k?j:k;     //牛逼
        System.out.println(re);
        System.out.println("--------------------");
        // 优先级
        System.out.println(10 > 3 || 10 > 3 && 10 < 3);
        System.out.println((10 > 3 || 10 > 3) && 10 < 3);
    }
}
