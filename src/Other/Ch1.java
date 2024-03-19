package Other;

import java.util.Scanner;

// 함수에 스캔 응용
// 놀이기구 탑승을 위한 키 검사
//
public class Ch1 {
    public static String needcm(String i , int cm)
    {
        int j = cm;

        if(j>150)
        {
            i+="가능합니다";
        } else {
            i+="불가능합니다";
        }
        return i;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("키를 입력 하세요.");
        int cm;

        cm = s.nextInt();
        System.out.println("입력한 숫자 "+cm);
        System.out.println(needcm("놀이기구 탑승 ",cm));

    }

}
