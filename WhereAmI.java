import java.util.Scanner;
public class WhereAmI {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int R = scan.nextInt();
        int C = scan.nextInt();
        int[][] card = new int[R][C];
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                card[r][c] = scan.nextInt();
            }
        }
        int target = scan.nextInt();
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                System.out.print(card[r][c] == target ? target + " " : "* ");
            }
            System.out.println();
        }
    }
}
