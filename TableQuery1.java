import java.util.Scanner;
public class TableQuery1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int R = scan.nextInt();
        int C = scan.nextInt();
        int[][] a = new int[R][C];
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                a[r][c] = scan.nextInt();
            }
        }
        int t = scan.nextInt();
        int q = scan.nextInt() - 1;
        if(t == 1){
            if(q >= 0 && q < R){
                for(int i=0;i<C;i++){
                    System.out.print(a[q][i] + " ");
                }
            }
            else{
                System.out.println("invalid Q");
            }
        }
        else if(t == 2){
            if(q >= 0 && q < C){
                for(int i=0;i<R;i++){
                    System.out.println(a[i][q]);
                }
            }
            else{
                System.out.println("invalid Q");
            }
        }
    }
}
