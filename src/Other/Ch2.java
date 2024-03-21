package Other;
// 별로 삼각형 그리기
// 손해성
public class Ch2 {
    public static void main(String[] args) {

        for (int i=0;i<5;i++)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=3;i>0;i--)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
