package Other;

import java.util.Scanner;

//손해성
// 일어나는 시간에서 45분 전으로 알람설정
public class Ch3 {
    public static int Hover(int i) // 25시 넘어가면 강제종료
    {
        if (i>23)
        {
            System.out.println("시간 초과 Error");
            System.exit(1);
        }
        return i;
    }

    public static void main(String[] args) {

        int H,M; // 시 ,분
        System.out.println("시 입력 (23시까지) ");
        Scanner a = new Scanner(System.in);
        H = a.nextInt();
        Hover(H);

        System.out.println("분 입력 (60분까지) ");
        Scanner b = new Scanner(System.in);

        for (M=b.nextInt(); M>59;M-=60)
        {
            H++;
        }
        Hover(H);

        System.out.println("입력한 시간 "+H+"시 "+M+"분");

        if (M>44)
        {
         M-=45;
         H++;
        } else {
            H--;
            M+=60;
            M-=45;
        }
        Hover(H);
        System.out.println("알람 설정 시간 "+H+"시 "+M+"분");

    }

}