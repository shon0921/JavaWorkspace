package Other;

import java.util.Scanner;

// 문자열 반복 한글자씩
public class Ch10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        String k;
        System.out.print("알파뱃 입력");
        k = s.next();
        System.out.print("숫자입력 ");
        n = s.nextInt();

        for (int i = 0; i < k.length(); i++)
        {
            for (int I = 0; I <= n; I++)
            {
                System.out.print(k.charAt(i));
            }

        }
    }
}

