package Patterns;
public class Pattern6{
    public static void main (String[] args){

        pattern(5);
    }
    //Method to print the pattern
    static void pattern(int n){
        //No.of rows
        for(int row = n-1; row >= 0; row--){
            //No.of cols
            for(int col = 0; col < n - row; col++){
                System.out.print((char)(65 + row + col) + " ");
            }
            System.out.println();
        }
    }
}