import java.util.Scanner;

public class cw04 {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        int a = v1/1000;
        v1 = v1%1000;
        int b = v1/100;
        v1 = v1%100;
        int c = v1/10;
        int d = v1%10;
        System.out.println(+a+"thousand\t"+b+"hundred\t"+c+"ten\t"+d+"dollar\t");
    }
}
