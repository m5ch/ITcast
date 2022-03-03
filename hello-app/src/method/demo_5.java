package method;

//明确return关键字的作用
public class demo_5 {
    public static void main(String[] args) {
        double a = 5,b = 0;
        q(a,b);
    }

    public static void q(double a, double b){
        if(b == 0){
            System.out.println("数据有误!!!");
            return;
        }
        else
            System.out.println(a / b);
    }
}
