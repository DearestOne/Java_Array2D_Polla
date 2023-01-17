import java.util.Scanner;
public class SummaryMap {
    static Scanner scan = new Scanner(System.in);
    static void display_array(int[][] x,int R,int C){
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                System.out.print(x[r][c] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int R = scan.nextInt();
        int C = scan.nextInt();
        int[][] x = new int[R][C];
        int n = scan.nextInt();
        for(int l=0;l<n;l++){
            int Rstart = scan.nextInt() - 1;
            int Cstart = scan.nextInt() - 1;
            int Rvalue = scan.nextInt();
            int Cvalue = scan.nextInt();
            boolean inRange = (Rstart >= 0) && (Rstart + Rvalue <= R) && (Cstart >= 0) && (Cstart + Cvalue <= C);
            if(inRange){
                boolean isbuy = false;
                for(int i=Rstart;i<Rstart + Rvalue;i++){
                    for(int j=Cstart;j<Cstart + Cvalue;j++){
                        if(x[i][j] == 1){
                            isbuy = true;
                        }
                    }
                }
                if(!isbuy){
                    for(int i=Rstart;i<Rstart + Rvalue;i++){
                        for(int j=Cstart;j<Cstart + Cvalue;j++){
                            x[i][j] = 1;
                        }
                    }
                }
            }
        }
        display_array(x, R, C);
    }
}
