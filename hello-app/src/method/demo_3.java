package method;

//比较两个数组是否相同
public class demo_3 {
    public static void main(String[] args) {
        int[] a = {10, 20, 40, 30,80}, b = {10, 20, 30, 40};
        if(compare1(a,b))
            System.out.println(true);
        else
            System.out.println(false);

    }

    public static boolean compare1(int[] a, int[] b) {
        if (a.length == b.length) {     //判断长度是否相等
            if(compare2(a , b)){
                for (int i = 0; i < a.length; i++) {
                    if (a[i] != b[i])
                        return false;
                }
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }
    //判断和是否相等
    public static boolean compare2(int[] a, int[] b){
        int sum1 = 0, sum2 =0;
        for (int i = 0; i < a.length; i++) {
            sum1 += a[i];
            sum2 += b[i];
        }
        return sum1 == sum2 ? true : false;
    }
}