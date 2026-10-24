// output -
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

public class P65_StarPattern3{
    public static void main(String[] args){

        //part 1 incresing
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                  System.out.print("*");
            }
            System.out.println();
        }
         
        //part 2 decresing
            for(int i =4; i>=1; i--){
                for(int j = 1; j<=i; j++){ 
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}

