import java.io.*;
import java.util.*;
public class DivisibleSumPair {
    public static void main(String args[]) {
        // your code here
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int count=0;
      int[] arr =new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      sc.close();
      
      // for(int i=0;i<n-1;i++){
      //   for(int j=i+1;j<n;j++){
      //     if((arr[i]+arr[j])%k==0){count++;}
      //   }
        
      // }
      int i=0;
      int j=n-1;
      while(i==n-2){
            if((arr[i]+arr[j])%k==0){count++;}
            else { j--;}
            if(j-1==i){i++;j=n-1;}
        
      }
      System.out.print(count);




      
    }
}