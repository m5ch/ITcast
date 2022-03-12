package method;

//方法重载
public class demo_4 {
    public static void main(String[] args) {
        int a = 5;
        String str = "岛国";
        fire();
        fire("米国");
        fire(3 , "岛国");
    }
    public static void fire(){
//        System.out.println("发射1枚导弹");
        fire("米国");
    }
    public static void fire(String str){
//        System.out.println("发射1枚导弹给" + str);
        fire(1,str);
    }
    public static void fire(int a, String str){
        System.out.println("发射" + a + "枚导弹给" + str);
    }
}
