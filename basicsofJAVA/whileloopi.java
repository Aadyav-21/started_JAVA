package basicsofJAVA;
import java.util.Scanner;
public class whileloopi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many times u want to print secret messgage");
        int num = sc.nextInt();
        String secret = "Aadya loves Harish";
        while(num>0){
            System.out.println(secret);
            num=num-1;
        }
    }
}
