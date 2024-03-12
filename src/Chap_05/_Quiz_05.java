package Chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {

        int[] shoes =new int[10];

        for (int i=0;i< shoes.length;i++)
        {
         shoes[i]=250+(5*i);
        }

        for (int size:shoes){
            System.out.println("사이즈" + size + " (재고있음)");
        }
    }
}
