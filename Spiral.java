import java.util.*;
import java.lang.*;
import java.io.*;

public class Spiral
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc= new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
      int[][]arr=new int[r][c];
      int top=0;
      int down=r-1;
      int left=0;
      int right=c-1;
      int d=0;
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){arr[i][j]=sc.nextInt();}
      }
  while(left<=right  &&  top<=down){
    if(d==0){
      for(int i=left;i<=right;i++){
        System.out.print(arr[top][i]+" ");
        
      }
      top++;
    }
    else if(d==1){
      for(int i=top;i<=down;i++){
        System.out.print(arr[i][right]+" ");
        
      }
      right--;
    }
    else if(d==2){
      for(int i=right;i>=left;i--){
        System.out.print(arr[down][i]+" ");
        
      }
      down--;
    }
    else{
      for(int i=down;i>=top;i--){
        System.out.print(arr[i][left]+" ");
      
      }
      left++ ;
    }
    d=(d+1)%4;
  }
 
}
}