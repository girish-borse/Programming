public class P64_StarPattern2{
    public static void main(String[] args){
        int n = 1;

        for(int i=5; i>=n; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
}