import java.util.*;
public class NinetyDegree {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]arr=new int[r][c];
         int [][]arr2=new int[c][r];
        for(int m=0;m<r;m++){
          for(int n=0;n<c;n++){arr[m][n]=sc.nextInt();}
        }
        int point=0;
        // int point2=arr[r-1][0];
        int i=0;
        int j=0;
        int x=r-1;
        // int y=0;
        
         while(point<c){
             
           if(j==r-1){j=0;i++;}  
           System.out.print(x);  
        //    arr2[i][j]=arr[x][point];
              j++;
              if(x==0){point++;x=r-1;} 
               x--;
          
           
                
                
         }
        //  for(int k=0;k<c;k++){
        //   for(int l=0;l<r;l++){System.out.print(arr2[k][l]+" ");}
        //    System.out.println("");
        // }
        
    }
}
