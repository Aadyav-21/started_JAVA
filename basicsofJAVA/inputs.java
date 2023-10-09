package basicsofJAVA;
import java.util.Scanner;
public class inputs {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        //System.out.println("enter the number");
       // int a= sc.nextInt();
        //System.out.println(a*2);
        char ch= 'b';
        //typecasting
        int b= (int)ch;
        //System.out.println(b);
        //logical operators
        int p=1 , q=10 , r=5;
        System.out.println((p>q) && (p<r));
        System.out.println((p<q) || (p>r));
        //bitwise operators
        System.out.println(p|q);
        System.out.println(p&q);
        System.out.println(p<<1);
        System.out.println(q>>1);
    }
}
