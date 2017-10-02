import java.util.Scanner;

public class cw03 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        int v2 = scn.nextInt();
        int v3 = scn.nextInt();
        if (v1 <= v2 && v2 <= v3 && v1 + v2>v3){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}