package FlowControl;

//目标：break和continue
public class demo_7 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            if (i % 3 == 0)
                break;
            System.out.println("哈哈哈" + i);
        }
        System.out.println();
        for (int i = 1; i < 4; i++) {
            System.out.println("国内进口二" + i);
            if (i == 3)
                continue;
        }
    }
}
