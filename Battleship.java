import java.util.Scanner;
public class Battleship {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int R = scan.nextInt();
        int C = scan.nextInt();
        int[][] x = new int[R][C];
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                x[r][c] = scan.nextInt();
            }
        }
        int k = scan.nextInt();
        System.out.println(k);
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                System.out.print(x[r][c] + " ");
            }
            System.out.println();
        }
        
    }
}
