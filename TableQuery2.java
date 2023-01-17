import java.util.Scanner;
public class TableQuery2 {
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
        int A = find_short(R, scan.nextInt() - 1);
        int B = find_short(R, scan.nextInt() - 1);
        int P = find_short(C, scan.nextInt() - 1);
        int Q = find_short(C, scan.nextInt() - 1);
        for(int r=A;r<=B;r++){
            for(int c=P;c<=Q;c++){
                System.out.print(a[r][c] + " ");
            }
            System.out.println();
        }
    }
}
