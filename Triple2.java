import java.util.Scanner;
public class Triple2 {
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
        int target = scan.nextInt();
        for(int r=0;r<R;r++){
            boolean have = false;
            for(int c=0;c<C-2;c++){
                if(Array[r][c] == target && Array[r][c+1] == target && Array[r][c+2] == target){
                    System.out.print(c+1 + " ");
                    have = true;
                    break;
                }
            }
            for(int c=C-3;c>=0;c--){
                if(Array[r][c] == target && Array[r][c+1] == target && Array[r][c+2] == target){
                    System.out.print(c+1 + " ");
                    have = true;
                    break;
                }
            }
            System.out.println(have ? "" : "0");
        }
    }
}
