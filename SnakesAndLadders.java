import java.util.Scanner;
public class SnakesAndLadders {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[][] table = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                table[i][j] = scan.nextInt();
            }
        }
        int count = 1;
        System.out.println("Ladders");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(table[i][j] > 1){
                    boolean can_use = table[i][j] + count <= n*n;
                    System.out.print(count + " goto " +(count + table[i][j]));
                    System.out.println(can_use ? "" : " error");
                }
                count++;
            }
        }
        count = 1;
        System.out.println("Snakes");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(table[i][j] < 0){
                    boolean can_use = count + table[i][j] > 0;
                    System.out.print(count + " goto " + (count + table[i][j]));
                    System.out.println(can_use ? "" : " error");
                }
                count++;
            }
        }
    }
}
