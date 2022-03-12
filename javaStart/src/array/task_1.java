package array;

public class task_1 {
    public static void main(String[] args) {
        int[] age = {22,19,27,25,30};
        int sum = 0;
        for (int i = 0; i < age.length; i++) {
            sum += age[i];
        }
        System.out.println(sum);
    }
}
