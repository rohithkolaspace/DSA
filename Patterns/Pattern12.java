package Patterns;

public class Pattern12 {
    public static void main(String[] args){
        pattern12(4);
    }
    public static void pattern12(int n){

        //No. of rows
        for(int row = 0; row < n; row++){

            //spaces
            for(int space = 0; space < row; space++){
                System.out.print(" ");
            }
            //cols
            for(int col = 0; col < n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
