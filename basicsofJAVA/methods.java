package basicsofJAVA;

import java.util.Scanner;
import java.util.Scanner;
class Algebra{
    int add(int a, int b){
        int ans = a+b;
        return ans;
    }
}
public class methods {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        System.out.println( "sum is");
        obj.add(a,b);
    }
}
