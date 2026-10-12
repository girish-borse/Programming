// output-
//     *
//    ***
//   *****
//  *******
// *********


public class P68_StarPattern6{
    public static void main(String[] args){

        //outer for rows
        for(int i=1; i<=5; i++){

            //inner for space
            for(int j=5; j>i; j--){
                System.out.print(" ");
            }
            
            //inner for stars 
            for(int k=1; k<=2*i-1; k++){
                
                   System.out.print("*");
                }
                 System.out.println();
                
            }
           
        }
    }

