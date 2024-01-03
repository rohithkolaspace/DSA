package Patterns;
public class Pattern5{
    public static void main (String[] args){

        pattern(5);
    }
    //Method to print the pattern
    static void pattern(int n){
        //No.of rows
        for(int row = 0; row <= n; row++){
            //No.of cols
            for(int col = 0; col <= row; col++){
                System.out.print((char)(65 + row + col) + " ");
            }
            System.out.println();
        }
    }
}