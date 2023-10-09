package basicsofJAVA;
import java.util.Scanner;
public class proAndLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost price");
        int cost = sc.nextInt();
        System.out.println("enter the selling price");
        int sell=sc.nextInt();
        int diff = sell - cost;
        if (diff<0){
            System.out.println("it's a loss!");
        }
        else{
            System.out.println("it's a profit!");
        }
    }
}
