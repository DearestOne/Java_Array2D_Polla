import java.util.Scanner;
public class NumLayer {
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
        int layer = Math.min(R, C) / 2;
        for(int i=0;i<layer;i++){
            int count = 0;
            for(int j=0;j<C-(i*2);j++){
                a[i][j+i] = count % 10;
                count++;
            }
            for(int j=1+i;j<R-1-i;j++){
                a[j][C-i-1] = count % 10;
                count++;
            }
            for(int j=C-1-i;j > i;j--){
                a[R-i-1][j] = count % 10;
                count++;
            }
            for(int j=R-1-i;j > i;j--){
                a[j][i] = count % 10;
                count++;
            }
        }
        display_array(a, R, C);
    }
}
