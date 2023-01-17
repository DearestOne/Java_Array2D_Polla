import java.util.Scanner;
public class ArrayAccess {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[][] array = new int[n][];
        int[] c = new int[n];
        for(int i=0;i<n;i++){
            c[i] = scan.nextInt();
            array[i] = new int[c[i]];
            for(int j=0;j<c[i];j++){
                array[i][j] = scan.nextInt();
            }
        }
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        int out = 0;
        for(;;){
            int A = scan.nextInt();
            if(A == 0){
                break;
            }
            int index = scan.nextInt();
            boolean inrange = false;
            if(A > 0 && A <= n){
                if(index >= 0 && index < c[A-1]){
                    sum += array[A-1][index];
                    min = Math.min(array[A-1][index],min);
                    max = Math.max(array[A-1][index],max);
                    inrange = true;
                }
            }
            if(!inrange){
                out++;
            }
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
        System.out.println(out);
    }
}
