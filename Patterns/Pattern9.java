package Patterns;
public class Pattern9{
    public static void main (String[] args){

        pattern(5);
    }
    //Method to print the pattern
    static void pattern(int n){
        //No.of rows
        for(int row = 1; row <= n; row++){
            //for spaces
            for(int space = 1; space <= n-row;space++){
                System.out.print(" ");
            }
            //No.of left half character printing
            for(int col = row; col <= (2*row)-1; col++){
                System.out.print(col);
            }
            //Right half char printing
            for(int coll = (2*row) - 2; coll >= row; coll--){
                System.out.print(coll);
            }
            System.out.println();
        }
    }
}