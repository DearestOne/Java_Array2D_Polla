import java.util.Scanner;
public class OnlyOne3 {
    static Scanner scan = new Scanner(System.in);
    static int find_short(int maxindex,int index){
        if(index < 0){
            return 0;
        }
        else if(index >= maxindex){
            return maxindex - 1;
        }
        else{
            return index;
        }
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
        int row = find_short(R, scan.nextInt() - 1);
        int col = find_short(C, scan.nextInt() - 1);
        int count = 0;
        for(int i=0;i<R;i++){
            if(a[i][col] == 1){
                count++;
            }
        }
        for(int i=0;i<C;i++){
            if(a[row][i] == 1 && i != col){
                count++;
            }
        }
        System.out.println(count);
    }
}
