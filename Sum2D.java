import java.util.Scanner;
public class Sum2D {
    static Scanner scan = new Scanner(System.in);
    static int sum(int R,int C,int r,int c,int[][] array){
        int sum = 0;
        for(int i=0;i<R;i++){
            sum += array[i][c];
        }
        for(int i=0;i<C;i++){
            sum += array[r][i];
        }
        return sum - array[r][c];
    }
    public static void main(String[] args) {
        int R = scan.nextInt();
        int C = scan.nextInt();
        int[][] a = new int[R][C];
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                a[r][c] = scan.nextInt();
            }
        }
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                System.out.print(sum(R, C, r, c, a) + " ");
            }
            System.out.println();
        }
    }
}
