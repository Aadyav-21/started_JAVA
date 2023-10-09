package basicsofJAVA;
import java.util.Scanner;
class ArraysExample{
    void demoArrays(){
        int[] ages = new int[3];
        float[] weights = new float[3];
        String[] names = new String[3];
        ages[0]=34;
        ages[1]=12;
        int [][] arr_1 = new int[5][3];
        int [][] arr = {{56,43,6},{34,7,8},{12,56,8}};
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);

    }
}
public class array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int [] marks= new int[n];
        System.out.println("enter the elements of the array");
        for (int i=0;i<n;i++){
            marks[i]=sc.nextInt();
            System.out.println(marks[i]);
        }
        int []re=marks.clone();


    }
}
