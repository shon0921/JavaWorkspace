package Chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {

        System.out.println(4+2);
        System.out.println(4-2);
        System.out.println(4*2);
        System.out.println(4/2);
        System.out.println(5%2);

        System.out.println(2+2*2);
        System.out.println((2+2)*2);
        System.out.println(2+(2*2));

        int a=20;
        int b=10;
        int c;

        c=a+b;
        System.out.println(c);

        c=a-b;
        System.out.println(c);

        c=a*b;
        System.out.println(c);

        c=a/b;
        System.out.println(c);

        c=a%b;
        System.out.println(c);

        //증감연산 ++, --
        int val;
        val=10;
        System.out.println(val); //10
        System.out.println(++val); //11
        System.out.println(val); //11

        val=10;
        System.out.println(val); //10
        System.out.println(val++); //10
        System.out.println(val);

        val=10;
        System.out.println(val);
        System.out.println(--val);
        System.out.println(val);

        val=10;
        System.out.println(val);
        System.out.println(val--);

        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("총 대기 인원 : " + waiting);

    }
}
