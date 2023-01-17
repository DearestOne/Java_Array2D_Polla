import java.util.Scanner;
import java.util.ArrayList;
public class HotSpot {
    static Scanner scan = new Scanner(System.in);
    static int sum_col(int[][] a,int R,int c,int target){
        int count = 0;
        for(int i=0;i<R;i++){
            if(target == a[i][c]){
                count++;
            }
        }
        return count;
    }
    static int sum_row(int[][] a,int C,int r,int c,int target){
        int count = 0;
        for(int i=0;i<C;i++){
            if(target == a[r][i] && i != c){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int R = scan.nextInt();
        int C = scan.nextInt();
        ArrayList<Integer> max_row = new ArrayList<>();
        ArrayList<Integer> max_col = new ArrayList<>();
        int[][] a = new int[R][C];
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                a[r][c] = scan.nextInt();
            }
        }
        int target = scan.nextInt();
        int max = 0;
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                int sum = sum_col(a, R, c, target) + sum_row(a, C, r, c, target);
                if(sum > max){
                    max = sum;
                    max_col.removeAll(max_col);
                    max_row.removeAll(max_row);
                    max_col.add(c+1);
                    max_row.add(r+1);
                }
                else if(max == sum){
                    max_col.add(c+1);
                    max_row.add(r+1);
                }
            }
        }
        System.out.println(max);
        System.out.println(max_col.size());
        for(int i=0;i<max_col.size();i++){
            System.out.println(max_row.get(i) + " " + max_col.get(i));
        }
    }
}
