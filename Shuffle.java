
import java.util.*;
public class Shuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      String str=sc.next();
      int []arr=new int[n];
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      
     char []ch=new char[n];
      for(int i=0;i<n;i++)
        {
          ch[arr[i]]=str.charAt(i);
        }
      for(int i=0;i<n;i++){System.out.print(ch[i]);}
      // String str2=new String (ch);
      // System.out.print(str2);
      
    }
}
