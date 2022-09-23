import java.util.*;

public class MinimumLengthWord {
    public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                String strin=sc.nextLine();
                String str=strin.trim();
                int count=0;
                int minCount=str.length();
                int index=0;
                        for(int i=0;i<str.length();i++)
                                {
                                        if(str.charAt(i)!=' ' ){count++;}
                                        if(str.charAt(i)==' '|| i==str.length()-1)
                                                        {
                                                                                // end of word here
                                                                    if(minCount>count)
                                                                          {
                                                                                      minCount=count;
                                                                                     index=i-count;
                                                                                      count=0;
                                                                                                              
                                                                                }
                                                                        else{ count=0;}
                                                        }
                                        
                                }
                // System.out.println(index);
                // System.out.println(minCount);
              for(int i=index;i<index+minCount;i++)
                      {
                              
                              System.out.print(str.charAt(i));
                      }
}
}
