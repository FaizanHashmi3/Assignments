import java.util.*;
import java.lang.*;
import java.io.*;

public class SumArrExptSelf
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc= new Scanner(System.in);
      int n= sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int out[]=new int [n];
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          if(i==j){continue;}
          out[i]=out[i]+arr[j];
        }
      }
      for(int i=0;i<n;i++){System.out.print(out[i]+" ");}
	}
}