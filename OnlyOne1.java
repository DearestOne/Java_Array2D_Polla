import java.util.Scanner;
public class OnlyOne1 {
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
        int max = 0;
        int index = 0;
        for(int c=0;c<C;c++){
            int count = 0;
            for(int r=0;r<R;r++){
                if(a[r][c] == 1){
                    count++;
                }
            }
            if(count >= max){
                index = c + 1;
                max = count;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
