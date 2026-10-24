public class P58_NumberPattern7{
    public static void main(String[] args){

        //outer loop for spaces
        for(int i =1; i<=5; i++){

            //inner loop for spaces
            for(int j=5; j>i; j--){
                System.out.print(" ");
            }

            //inner loop for number print
            for(int k=1; k<=i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

// output -
//     1
//    12
//   123
//  1234
// 12345