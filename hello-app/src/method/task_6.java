package method;

import java.util.Scanner;


//评委打分
public class task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] score = new double[5];
        for (int i = 0; i < 5; i++) {
            score[i] = sc.nextDouble();
        }
        double p = score(score);
        System.out.printf("%.2f",p);
    }

    public static double score(double[] score){
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length - 1 - i; j++) {
                if (score[j] > score[j + 1]){
                    double temp = score[j];
                    score[j] = score[j + 1];
                    score[j+1] = temp;
                }
            }

        }
        double sum = 0;
        for (int i = 1; i < score.length - 1; i++) {
            System.out.print(score[i] + "\t");
            sum += score[i];
        }
        System.out.println();
        return sum / (score.length - 2);
    }
}
