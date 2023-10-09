package basicsofJAVA;


public class TWOdarrays {
    //printing array  function
    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] arr=new int[2][3];
        arr[0][0]=1;
        int [][]brr= {{1,2},{3,4}};
    }
}
