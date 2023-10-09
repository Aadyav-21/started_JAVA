package basicsofJAVA;
import java.util.Scanner;
public class countOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any digit");
        int num = sc.nextInt();
        int i= 0;
        int sum=0;
        int rev=0;
        while(num>0){
             int d= num%10;
             sum=sum+d;
              rev= rev*10 +d;
             i++;
             num=num/10;
        }
        System.out.println(i);
        System.out.println(sum);
        System.out.println(rev);
    }
}
