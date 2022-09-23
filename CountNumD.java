
import java.util.*;
public class CountNumD {
    public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n=sc.nextInt();
                int d=sc.nextInt();
                System.out.print(numD(n,d));
	}
        static int numD(int n ,int d)
        {
                int count=0;
                int r=0;
                while(n>0)
                        {
                                r=n%10;
                                if(r==d){count++;}
                                n=n/10;
                        }
                return count;
        }
}
