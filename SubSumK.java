import java.util.*;
import java.lang.*;
import java.io.*;

public class SubSumK
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner fhd =new Scanner(System.in);
      int n= fhd.nextInt();
      int k=fhd.nextInt();
      int [] nums=new int[n];
      for(int i=0;i<n;i++){
        nums[i]=fhd.nextInt();
      }
      int sum=0;
      int count=0;
     for(int i=0;i<n;i++){
         if(nums[i]%k==0){count++;}
        sum=nums[i];
       for(int j=i+1;j<n;j++){
        sum=sum+nums[i]+nums[j];
        
         if(sum%k==0){count++;}
       
        
       }
       sum=0;
      
      
     }
      System.out.println(count);
	}
}