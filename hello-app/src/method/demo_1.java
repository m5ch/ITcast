package method;

public class demo_1 {
    public static void main(String[] args) {
        int x = 9, y = 4;
        System.out.println(sum(x, y));
        System.out.println("---------------");
        print();
    }

    public static void print(){
        for (int i = 0; i < 3; i++) {
            System.out.println("你好！！");
        }
    }


    public static int sum(int x, int y){
        int sum = x + y;
        return sum;
    }
}
