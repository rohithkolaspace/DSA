package Patterns;

public class Pattern1{
    public static void main (String[] args){
        pattern(5);
    }

    //Method to print the pattern
    static void pattern(int n){

        //No.of rows
        for(int row = 0; row < 5; row++){
            //No.of cols
            for(int col = 0; col < 5; col++){
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
