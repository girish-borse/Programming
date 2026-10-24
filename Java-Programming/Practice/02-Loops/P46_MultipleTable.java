public class P46_MultipleTable
{
  public static void main(String[] args)
  {
    for(int i = 1; i <= 3; i++)          // table number
    {
        for(int j = 1; j <= 10; j ++)          // inner loop contains how many time multiply
        {
            System.out.println(j);
        }
        
    }
  }
}

// output -
// 1
// 2
// 3
// ...
// 10
// 1
// 2
// 3
// ...
// 10
// 1
// 2
// 3
// ...
// 10