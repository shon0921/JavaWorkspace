package Ch2;

import java.util.Scanner;

// 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에
// 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.

public class Test {
    public static void main(String[] args) {

        int a,b,c;
        int sum;
        System.out.println("숫자 3개 입력 : ");

        Scanner num = new Scanner(System.in);
        a = num.nextInt();
        b = num.nextInt();
        c = num.nextInt();

        sum = a*b*c;
        System.out.println("합 : "+sum);
        num.close();

        int[] counts = new int[10];
        while (sum > 0) {
            counts[sum % 10]++;
            sum /= 10;
        }
        for (int i=0; i < counts.length; ++i) {
            System.out.println(counts[i]);
        }




    }
}
