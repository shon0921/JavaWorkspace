package Other;

import java.util.Scanner;
//단어 갯수 출력
public class Ch11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine().trim(); // 공백제거

        if (st.isEmpty()) // 문자열의 길이가 0이라면 true
        {
            System.out.println('0'); // 0
        }
        else
        {
            System.out.println(st.split(" ").length); // split 자를거 자른 문자열의 갯수
        }
    }
}
