import java.util.Scanner;
public class NumTable2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int R = scan.nextInt();
        int C = scan.nextInt();
        int[][] table = new int[R][C];
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                table[r][c] = scan.nextInt();
            }
        }
        int n = scan.nextInt();
        int[] row = new int[n];
        int[] col = new int[n];
        for(int i=0;i<n;i++){
            row[i] = scan.nextInt() - 1;
            col[i] = scan.nextInt() - 1;
        }
        boolean inRange_before = false;
        int num_before = -1;
        for(int i=0;i<n;i++){
            boolean inRange = row[i] >= 0 && row[i] < R && col[i] >= 0 && col[i] < C;
            if(!inRange && inRange_before){
                System.out.println();
                num_before = -1;
            }
            else if(inRange){
                if(num_before == table[row[i]][col[i]]){
                    System.out.print("*");
                }
                else{
                    num_before = table[row[i]][col[i]];
                    System.out.print(table[row[i]][col[i]]);
                }
            }
            inRange_before = inRange;
        }
    }
}
