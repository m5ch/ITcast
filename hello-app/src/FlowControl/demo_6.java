package FlowControl;

//目标：嵌套循环
public class demo_6 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("我爱你！！！");
            }
        }
        System.out.println("=================");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
