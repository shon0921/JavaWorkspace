package Chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int x=115;
        int y=121;
        int min=120;

        String s = (x<min) ? "cm 이므로 탑승 불가능합니다" : "cm 이므로 탑승 가능합니다";
        System.out.println("키가 "+x+s);

        String d = (y<min) ? "cm 이므로 탑승 불가능합니다" : "cm 이므로 탑승 가능합니다";
        System.out.println("키가 "+y+d);




    }
}
