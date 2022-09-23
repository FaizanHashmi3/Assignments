import java.util.*;
public class RowColumnDifference {
    public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int [][]arr=new int[n][n];
                for(int i=0;i<n;i++)
                        {
                                  for(int j=0;j<n;j++){arr[i][j]=sc.nextInt();}
                        }

                for(int i=0;i<n;i++)
                {   int colu=colSum(arr, i);
                    int row=rowSum(arr, i);
                    System.out.println(colu-row);
                }        

               
        }
        static int rowSum(int [][]arr,int row)
        {
            int sum=0;
            for(int i=0;i<arr.length;i++){
                  sum+=arr[row][i];  
            }
            return sum;
        }
        static int colSum(int [][]arr,int col)
        {
            int sum=0;
            for(int i=0;i<arr[0].length;i++){
                  sum+=arr[i][col];  
            }
            return sum;
        }



}
