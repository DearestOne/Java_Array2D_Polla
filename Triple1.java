import java.util.Scanner;
public class Triple1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int R = scan.nextInt();
        int C = scan.nextInt();
        int[][] Array = new int[R][C];
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                Array[r][c] = scan.nextInt();
            }
        }
        int v = scan.nextInt();
        for(int r=0;r<R;r++){
            for(int c=1;c<C-1;c++){
                boolean is_triple = (Array[r][c-1] == v) && (Array[r][c] == v) && (Array[r][c+1] == v);
                if(is_triple){
                    System.out.print(r + 1 + " ");
                    break;
                }
            }
        }
    }
}
