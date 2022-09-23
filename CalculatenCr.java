import java.util.*;

public class CalculatenCr {
    public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int r= sc.nextInt();
                /*formula of calculating nCr is:
             nCr = n! / ((n – r)! r!) .................*/
                    long result=1;
                result=fact(n)/(fact(n-r)*fact(r));
                System.out.print(result);
                
                
	}
       static long fact(int a){
                long prod=1;
                for(int i=2;i<=a;i++)
                        {
                          prod*=i;      
                        }
                return prod;
        }
}
