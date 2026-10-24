public class P61_NumberPattern10{
    public static void main(String[] args){

        //outer for rows
        for(int i=1; i<=5; i++){

            // first inner loop for spaces
            for(int j=5; j>i; j--){
                System.out.print(" ");
            } 
            //second inner loop for number print increasing
            for(int k=1; k<=i; k++){
                System.out.print(k);
            }
            //third inner loop for number print decreasing
            for(int j=i-1; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// output -
//     1
//    121
//   12321
//  1234321
// 123454321