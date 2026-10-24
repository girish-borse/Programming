public class P62_NumberPattern11{
    public static void main(String[] args){
        for(int i =1; i<=9; i++){
            if(i<=5){
                for(int j=1; j<=i; j++){
                     System.out.print(j);
                   }
             }else{
                for( int k=1; k<=10-i; k++){
                    System.out.print(k);
                }
                
             }
             System.out.println();     
        } 
       
     }

 }

// output - 
// 1
// 12
// 123
// 1234
// 12345
// 1234
// 123
// 12
// 1
