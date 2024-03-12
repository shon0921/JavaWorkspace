package Chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {

        int tax = 0;
        for (int i =0;i<5;i++)
        {
            tax+=4000;
        }
        System.out.println("일반 차량 주차 요금은 "+tax+"입니다.");


        tax=0;
        for (int i =0;i<5;i++)
        {
            tax+=4000;
        }
        System.out.println("경차 주차 요금은 "+(tax/2)+"입니다.");

        tax=0;
        for (int i =0;i<10;i++)
        {
            tax+=4000;
            if (tax>30000)
            {
                tax=30000;
                break;
            }

        }
        System.out.println("장애인 차량 주차 요금은 "+(tax/2)+"입니다.");


    }
}
