package Patterns;
public class Pattern7{
    public static void main (String[] args){

        pattern(5);
    }
    //Method to print the pattern
    static void pattern(int n){
        //No.of rows
        for(int row = 1; row < n; row++){
            //No.of Spaces
            for(int space = 1; space < n - row; space++){
                System.out.print(".");
            }
            for(int letter = 1; letter <= row; letter++){
                System.out.print(letter);
            }
            System.out.println();
        }
    }
}