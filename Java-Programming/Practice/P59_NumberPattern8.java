public class P59_NumberPattern8{
    public static void main(String[] args){

        for(int i=1; i<=5; i++){
            for(int j=i; j<5; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

// output-
//     1
//    123
//   12345
//  1234567
// 123456789