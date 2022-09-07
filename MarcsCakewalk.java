import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class MarcsCakewalk
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
       Scanner sc =  new Scanner (System.in);
      int n= sc.nextInt();
      double dist=0;
      
      Integer []arr=new Integer [n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
     Arrays.sort(arr, Collections.reverseOrder());
      for(int k=0;k<n;k++){
       dist=dist+(Math.pow(2,k)*arr[k]);
       
        
      }
      long Dist=(long)dist;
      System.out.println(Dist);

      
	}
}