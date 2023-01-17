import java.util.Scanner;
public class FillGasTank {
    static Scanner scan = new Scanner(System.in);
    static int fuelcost(int r,int c,int[][] distance,char value){
        int result = 0;
        if(value == 'L'){
            result = (int)(350 * (double)distance[r][c] / 60);
        }
        else if(value == 'M'){
            result = (int)(270 * (double)distance[r][c] / 60);
        }
        else if(value == 'S'){
            result = (int)(200 * (double)distance[r][c] / 60);
        }
        return result;
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[][] distance = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                distance[i][j] = scan.nextInt();
            }
        }
        int k = scan.nextInt();
        for(int i=0;i<k;i++){
            char option = scan.next().charAt(0);
            int r = scan.nextInt() - 1;
            int c = scan.nextInt() - 1;
            System.out.println(fuelcost(r, c, distance, option));
        }
    }
}
