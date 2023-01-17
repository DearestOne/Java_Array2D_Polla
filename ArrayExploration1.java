import java.util.Scanner;
public class ArrayExploration1 {
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
        int k = scan.nextInt();
        int countplus = 0,countminus = 0,countodd = 0,counteven = 0;
        for(int i=0;i<k;i++){
            int r = scan.nextInt() - 1;
            int c = scan.nextInt() - 1;
            boolean is_in_range = (r >= 0 && r < R) && (c >= 0 && c < C);
            if(is_in_range){
                if(Array[r][c] % 2 == 0){
                    counteven++;
                }
                else{
                    countodd++;
                }
                if(Array[r][c] > 0){
                    countplus++;
                }
                else if(Array[r][c] < 0){
                    countminus++;
                }
            }
        }
        System.out.print(countplus + " " + countminus + " ");
        System.out.print(counteven + " " + countodd);
    }
}
