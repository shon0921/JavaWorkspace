package Other;

import java.util.Scanner;

public class Ch8 {
    public static void main(String[] args) {
        String y;
        Scanner str = new Scanner(System.in);

        System.out.println("영어 입력");
        y = str.nextLine();
        for(char a= 'a'; a<='z'; a++)
        {
            System.out.println(y.indexOf(a)+" ");
        }
        //
    }
}
