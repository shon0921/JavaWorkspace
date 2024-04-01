package Other;

import java.util.Scanner;

public class a10
{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            int R=sc.nextInt();
            String S=sc.next();
            for(int j=0;j<S.length();j++) {
                for(int k=0;k<R;k++)
                {System.out.print(S.charAt(j));}
            }
            System.out.println();
        }
    }
}


