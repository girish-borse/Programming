import java.util.Scanner;

public class P47_MultipleTableInput{
    public static void main(String[] args){
        Scanner sobj = new Scanner(System.in);
        int n =sobj.nextInt();

        for(int i= 1; i<=n; i++){
            for(int j = 1; j<=10; j++){
                System.out.println(i + "x" + j + "=" + i * j);
            }
            System.out.println();
        }
    }
}