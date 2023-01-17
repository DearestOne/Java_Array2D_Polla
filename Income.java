import java.util.Scanner;
public class Income {
    static Scanner scan = new Scanner(System.in);
    static int display_income(int[][] x,int[][] price,int R,int C){
        int sum = 0;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(x[i][j] == 1){
                    sum = sum + price[i][j];
                }
            }
        }
        return sum;
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
        int[][] price = new int[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                price[i][j] = scan.nextInt();
            }
        }
        System.out.println(display_income(x, price, R, C));
    }
}
