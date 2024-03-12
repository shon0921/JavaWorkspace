package Chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반목문 For
        // 나코 매장
        System.out.println("어서오세요. 나코입니다");
        // 또 다른 손님이 들어오면?
        System.out.println("어서오세요. 나코입니다");
        System.out.println("어서오세요. 나코입니다");
        System.out.println("어서오세요. 나코입니다");
        System.out.println("어서오세요. 나코입니다");
        System.out.println("어서오세요. 나코입니다");
        System.out.println("어서오세요. 나코입니다");

        // 반복문 사용 For
        for (int i = 0; i < 10 ; i++ )
        {
            System.out.println("환영합니다. 코나입니다");
        }

        // 짝수 만 출력 (fori 만 적고 엔터)
        for (int i = 0; i < 10 ; i+=2)
        {
            System.out.print(i);
        }
        System.out.println();

        // 홀수만 출력
        for (int i = 1;i<10;i+=2)
        {
            System.out.print(i);
        }
        System.out.println();
        // 거꾸로 숫자
        // 5,4,3,2,1
        for ( int i = 5; i>0; i--)
        {
            System.out.print(i);
        }

        int sum =0;
        // 1부터 10까지의 수들의 합
        for (int i =0; i<11; i++)
        {
            sum += i;
        }
        System.out.println();
        System.out.println(sum);
    }
}
