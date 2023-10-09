package basicsofJAVA;
import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //pyramid pattern
        int n = sc.nextInt();
        System.out.println("Enter the number for the lines for the pattern");
        for(int i=1;i<n;i++){
            int j=1;
            while (j<=n-i ){

                j++;
                System.out.print(" ");
            }
            for(int k =1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
