package Chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {

        String c= "901231-1234567";

        System.out.println(c.substring(c.indexOf("9"), c.indexOf("234")));

        String a= "\"030708-4567890\"";

        System.out.println(a.substring(a.indexOf("0"), a.indexOf("56")));

        System.out.println(c.substring(0,8)); // 1 위치부터 8위치 전까지
        System.out.println(c.substring(0, c.indexOf("-") +2)); // 0위치부터 하이픈 위치 +2 직전까지

    }
}
