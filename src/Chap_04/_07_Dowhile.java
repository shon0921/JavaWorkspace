package Chap_04;

public class _07_Dowhile {
    public static void main(String[] args) {
        // 반목문 DoWhile
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리 0m
        int height = 2; // 키 2m
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3m 이동
        }
        System.out.println("도착했습니다.");
        System.out.println("....반목문 #1");

        // 키가 엄청나게 큰 사람?
        move = 0;
        height = 25;
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3m 이동
        }
        System.out.println("도착했습니다.");

        // Do while 반복문
        do{
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : "+move);
        } while (move + height < distance);
        System.out.println("도착했습니다. ");
    }
}
