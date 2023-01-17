import java.util.Scanner;
public class NumTable3 {
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
        int count = 0;
        int max = 0;
        int allmax = 0;
        for(int i=0;i<n;i++){
            boolean inRange = row[i] >= 0 && row[i] < R && col[i] >= 0 && col[i] < C;
            if(!inRange){
                count = 0;
            }
            else if(inRange){
                count++;
                if(count > max){
                    max = count;
                    allmax = 1;
                }
                else if(count == max){
                    allmax++;
                }
            }
        }
        System.out.println(max);
        System.out.println(allmax);
    }
}
