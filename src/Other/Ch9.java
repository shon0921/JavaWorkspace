package Other;

public class Ch9 {
    public static void main(String[] args) {
        String s = "127.0.0.1 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326 \"http://www.example.com/start.html\" \"Mozilla/4.08 [en] (Win98; I ;Nav)\"";
        int n1,n2;

        System.out.println(s.substring(0,s.indexOf(" "))); // 아이피 주소만 출력

        n1 = s.indexOf("\"") + 1;
        n2 = s.indexOf("T") +1;

        System.out.println(s.substring(n1,n2)); // GET 찍기

    }
}