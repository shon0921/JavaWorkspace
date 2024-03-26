package Other;

import java.util.Scanner;
// 정삼각형 길이 구하기
public class Ch7
{
    public static void main(String[] args)
    {
        System.out.println("정삼각형 길이 입력 ==> ");
        Scanner n = new Scanner(System.in);
        int I = n.nextInt();

        for(int i=0;i<I;i++)
        {
                for (int j = I; i < j; j--) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int k = 0; k < i; k++) {
                    System.out.print("**");

                }
                System.out.println();

            //손해성
        }
    }
}


