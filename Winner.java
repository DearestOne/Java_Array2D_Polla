import java.util.Scanner;
public class Winner {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int R = scan.nextInt();
        int C = scan.nextInt();
        int[][] x = new int[R][C];
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                x[r][c] = scan.nextInt();
            }
        }
        int k = scan.nextInt();
        int out_range = 0,fail = 0,success = 0;
        int same_spot_ship = 0,same_spot_sea = 0;
        int last_destroy = 0,first_destroy = -1;
        for(int i=0;i<k;i++){
            int AR = scan.nextInt();
            int AC = scan.nextInt();
            boolean is_in_range = (AR <= R && AR > 0) && (AC <= C && AC > 0);
            AC -= 1;
            AR -= 1;
            if(!is_in_range){
                out_range++;
            }
            else if(x[AR][AC] == 0){
                x[AR][AC] = -1;
                fail++;
            }
            else if(x[AR][AC] == 1){
                x[AR][AC] = -2;
                success++;
                if(last_destroy == 0){
                    first_destroy = i + 1;
                }
                last_destroy = i + 1;
            }
            else if(x[AR][AC] == -1){
                same_spot_sea++;
            }
            else if(x[AR][AC] == -2){
                same_spot_ship++;
            }
        }
        System.out.println(success);
        System.out.println(fail);
        System.out.println(same_spot_ship);
        System.out.println(same_spot_sea);
        System.out.println(out_range);
        boolean life = false;
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(x[r][c] == 1){
                    life = true;
                }
            }
        }
        if(life){
            System.out.println("battleship " + first_destroy);
        }
        else{
            System.out.println("attacker " + last_destroy);
        }
    }
}
