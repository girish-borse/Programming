// output-
//     *
//    **
//   ***
//  ****
// *****

public class P67_StarPattern5{
    public static void main(String[] args){

        //outer for rows
        for(int i=1; i<=5; i++){
            //inner for spaces
            for(int j=5; j>i; j--){
                System.out.print(" ");
            }
            //for printing stars
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}

