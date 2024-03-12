package Chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {

        boolean 김치찌개 = false;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;


        System.out.println(김치찌개 || 계란말이 || 제육볶음); // 하나라도 true이면 true
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // 모두 true이면 true

        // AND 연산
        System.out.println((5>3)&&(3>1));
        System.out.println((5>3)&&(3<1));

        //OR 연산
        System.out.println((5>3)||(3>1));
        System.out.println((5>3)||(3<1));
        System.out.println((5<3)||(3<1));

        // 논리 부정 연산자 (!붙으면 반대로 결과가 나옴)
        System.out.println(!true); // false
        System.out.println(!false);
        System.out.println(!(5==5));
        System.out.println(!(5==3));


    }
}
