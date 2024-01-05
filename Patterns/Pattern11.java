package Patterns;
import java.lang.Math;

public class Pattern11 {
    public static void main(String[] args){
        pattern(4);
    }
    public static void pattern(int n){
        int total = 2*n -2;
        //no.of rows
        for(int row = 0; row <= total; row++){
            //no.of cols
            for(int col = 0; col <= total; col++){
                int value = n - Math.min(Math.min(row, col),Math.min(total - row, total - col));
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
