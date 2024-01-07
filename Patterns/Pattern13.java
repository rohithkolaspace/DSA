package Patterns;

public class Pattern13 {
    public static void main(String[] args){
        pattern(4);
    }
    public static void pattern(int n){

        //No. of rows
        for(int row = 1; row <= n; row++){

            //cols
            int sum = 0;
            for(int col = 1; col <= row; col++){
                if(col ==row){
                    System.out.print(col);
                    sum += col;
                }
                else{
                    System.out.print(col + "+");
                    sum += col;
                }
            }
            System.out.print("="+sum);
            System.out.println();
        }
    }
}
