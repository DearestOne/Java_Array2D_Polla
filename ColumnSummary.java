import java.util.Scanner;
public class ColumnSummary {
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
        int sum = 0;
        for(int c=0;c<C;c++){
            int count = 0;
            for(int r=0;r<R;r++){
                if(card[r][c] == target){
                    count++;
                    sum++;
                }
            }
            System.out.print(count > 0 ? count + " " : "* ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
