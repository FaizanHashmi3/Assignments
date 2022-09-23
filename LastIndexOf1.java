import java.util.*;
public class LastIndexOf1 {
    public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                 Scanner sc = new Scanner(System.in);
                String str= sc.next();
                int index=lastIndex(str);
                System.out.print(index);
	}
        static int lastIndex(String str)
        {
                int res=-1;
                for(int i=str.length()-1;i>=0;i--)
                        {
                                if(str.charAt(i)=='1'){res=i;break;}
                        }
                return res;
        }
}
