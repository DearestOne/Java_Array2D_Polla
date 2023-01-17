import java.util.Scanner;
public class RowCapacity {
    static Scanner scan = new Scanner(System.in);
    static void display_array(int[][] array,int R,int C){
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int R = scan.nextInt();
        int C = scan.nextInt();
        int[][] a = new int[R][C];
        int[] sum_row = new int[R];
        int k = scan.nextInt();
        int q = scan.nextInt();
        for(int i=0;i<q;i++){
            int row = scan.nextInt() - 1;
            int col = scan.nextInt() - 1;
            int quan = scan.nextInt();
            if(sum_row[row] + quan <= k){
                sum_row[row] += quan;
                a[row][col] += quan;
            }
        }
        display_array(a, R, C);
    }
}
