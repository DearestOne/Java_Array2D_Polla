import java.util.Scanner;
public class Warp {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int R = scan.nextInt();
        int C = scan.nextInt();
        int[][] map = new int[R][C];
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                map[r][c] = scan.nextInt();
            }
        }
        int rstart = scan.nextInt() - 1;
        int cstart = scan.nextInt() - 1;
        int warpR = -1,warpC = -1;
        int warpNum = 0;
        boolean found_warp = false;
        for(int r=rstart;r<R;r++){
            if(r == rstart){
                for(int c = cstart;c<C;c++){
                    if(map[r][c] > 0){
                        found_warp = true;
                        warpR = r + 1;
                        warpC = c + 1;
                        warpNum = map[r][c];
                        break;
                    }
                }
            }
            else{
                for(int c=0;c<C;c++){
                    if(map[r][c] > 0){
                        found_warp = true;
                        warpR = r + 1;
                        warpC = c + 1;
                        warpNum = map[r][c];
                        break;
                    }
                }
            }
            if(found_warp){
                break;
            }
        }
        System.out.println(warpNum);
        System.out.println(warpR + " " + warpC);
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                boolean is_door = r == warpR - 1 && c == warpC - 1;
                if(map[r][c] == warpNum && !is_door){
                    System.out.println((r+1) + " " + (c+1));
                    break;
                }
            }
        }
    }
}
