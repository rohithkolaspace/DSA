package Patterns;
public class Pattern10{
    public static void main (String[] args){

        pattern(5);
    }
    //Method to print the pattern
    static void pattern(int n){
        //No.of rows
        for(int row = 1; row <= n; row+=2){
            //for spaces
            for(int space = 1; space < n-row;space+=2){
                System.out.print(" ");
            }
            //No.of left half character printing
            for(int col = 1; col <= (row); col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row = n -2; row >= 1; row-=2){
            //space
            for(int space = 1; space < n - row; space+=2){
                System.out.print(" ");
            }
            //char printing
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}