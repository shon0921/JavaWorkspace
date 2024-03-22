package Other;

import java.util.Scanner;

public class Ch4
{
    public static void main(String[] args)
    {
        int arr[];
        int sum = 0; // 합계
        Scanner S = new Scanner(System.in);

        System.out.println("학생 수 입력 : ");
        int b = S.nextInt(); // 입력 받은 학생 수
        arr = new int[b];
        for (int a=0; a < b ; a++)
        {
            System.out.println(a+1+" 번 학생 점수 입력 : ");
            arr[a] = S.nextInt();
        }
        double average;
        for (int a=0; a < b; a++)
        {
            sum += arr[a];

        }
        average = sum/b;
        System.out.printf("학생 점수 평균 ");
        System.out.printf("%.3f", average);
    }

}
