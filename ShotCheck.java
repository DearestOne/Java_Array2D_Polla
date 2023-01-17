import java.util.Scanner;
public class ShotCheck {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int R = scan.nextInt();
        int C = scan.nextInt();
        int k = scan.nextInt();
        int count_in = 0,count_out = 0;
        for(int i=0;i<k;i++){
            int r = scan.nextInt();
            int c = scan.nextInt();
            boolean is_in_range = (r <= R && r > 0) && (c <= C && c > 0);
            if(is_in_range){
                count_in++;
            }
            else{
                count_out++;
            }
        }
        System.out.println(count_in);
        System.out.println(count_out);
    }
}
