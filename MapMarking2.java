import java.util.Scanner;
public class MapMarking2 {
    static Scanner scan = new Scanner(System.in);
    static int walk_count(int[][] field,int R,int C){
        int count = 0;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(field[i][j] == 1){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int R = scan.nextInt();
        int C = scan.nextInt();
        int[][] field = new int[R][C];
        int r = scan.nextInt() - 1;
        int c = scan.nextInt() - 1;
        field[r][c] = 1;
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            int move = scan.nextInt();
            if(move == 1){
                for(int j=0;j<C;j++){
                    c = (c == 0) ? C - 1 : c - 1;
                    if(field[r][c] == 0){
                        field[r][c] = 1;
                        break;
                    }
                }
            }
            else if(move == 2){
                for(int j=0;j<C;j++){
                    c = (c == C - 1) ? 0 : c + 1;
                    if(field[r][c] == 0){
                        field[r][c] = 1;
                        break;
                    }
                }
            }
            else if(move == 3){
                for(int j=0;j<R;j++){
                    r = (r == 0) ? R - 1 : r - 1;
                    if(field[r][c] == 0){
                        field[r][c] = 1;
                        break;
                    }
                }
            }
            else if(move == 4){
                for(int j=0;j<R;j++){
                    r = (r == R - 1) ? 0 : r + 1;
                    if(field[r][c] == 0){
                        field[r][c] = 1;
                        break;
                    }
                }
            }
        }
        System.out.println(r + 1 + " " + (c+1));
        System.out.println(walk_count(field, R, C));
    }
}
