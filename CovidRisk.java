import java.util.Scanner;
public class CovidRisk {
    static Scanner scan = new Scanner(System.in);
    static void display(int R,int C,int[][] array){
        int max = 0;
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                max = Math.max(max,array[r][c]);
                System.out.print(array[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println(max);
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(array[r][c] == max){
                    System.out.print((r+1) + " ");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int R = scan.nextInt();
        int C = scan.nextInt();
        int[][] people = new int[R][C];
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            int r = scan.nextInt() - 1;
            int c = scan.nextInt() - 1;
            for(int j=r-1;j<=r+1;j++){
                for(int k=c-1;k<=c+1;k++){
                    boolean inrange = j >= 0 && j < R && k >= 0 && k < C;
                    if(inrange){
                        people[j][k]++;
                    }
                }
            }
            people[r][c]++;
        }
        display(R, C, people);
    }
}
