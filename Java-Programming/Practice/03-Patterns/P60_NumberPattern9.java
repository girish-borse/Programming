public class P60_NumberPattern9{
    public static void main(String[] args){
        //outer loop for rows
        for(int i=1; i<=5; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=6-i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

// output -
// 12345
//  1234
//   123
//    12
//     1