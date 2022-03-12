package FlowControl;

import java.util.Random;

//目标：Random
public class task1 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 1; i <= 10 ;i++) {
            int a = r.nextInt(10) + 1;
            System.out.println(a);
        }
        System.out.println("-------------");
        for (int i = 0 ; i < 10 ; i++) {
            int j = r.nextInt(5,10);
            System.out.println(j);
        }
    }
}
