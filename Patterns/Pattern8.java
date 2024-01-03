package Patterns;
public class Pattern8{
    public static void main (String[] args){

        pattern(5);
    }
    //Method to print the pattern
    static void pattern(int n){
        //No.of rows
        for(int row = n; row > 0; row--){
            //No.of cols
            for(int col = 1; col <= row; col++){
                System.out.print(row);
            }
            System.out.println();
        }
    }
}