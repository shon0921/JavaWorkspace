package Other;

import java.util.Scanner;

// 손해성
public class Ch5 {
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);
        System.out.println("삼각형 길이 입력");
        int C = c.nextInt();

        for (int i=0;i<C+1;i++)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=C-1;i>0;i--)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}