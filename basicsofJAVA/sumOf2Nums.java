package basicsofJAVA;
import java.util.Scanner;
public class sumOf2Nums {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd number");
        int num_2=sc.nextInt();
        int sum = num1+num_2;
        System.out.println(("sum of numbers is"+" "+ sum));
    }
}
