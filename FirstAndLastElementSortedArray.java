import java.util.*;
public class FirstAndLastElementSortedArray {
    public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n=sc.nextInt();
                int target=sc.nextInt();
                int [] nums=new int[n];
                for(int i=0;i<n;i++){nums[i]=sc.nextInt();}
              int []arr2= findIndex(nums,target);
                System.out.print(arr2[0]+" "+arr2[1]);
                
	}
        static int [] findIndex(int []nums,int target)
        {
               int lo=0;
                int hi=nums.length-1;
                int []arr={-1,-1};
        
                //finding first index
                while(lo<=hi)   /*<-  "it is very important to use = with < here " */
                        {
                                int mid=(lo+hi)/2;
                                if(nums[mid]==target)
                                {arr[0]=mid;
                                 //continue searching in left side
                                 hi=mid-1;
                                }
                                else if(nums[mid]>target){hi=mid-1;}
                                else{lo=mid+1;}
                        }
                lo=0;
                hi=nums.length-1;
                // finding last index
                while(lo<=hi)    /*<-  "it is very important to use = with < here " */
                        {
                                int mid=(lo+hi)/2;
                                if(nums[mid]==target)
                                {arr[1]=mid;
                                 //continue searching in right side
                                 lo=mid+1;
                                }
                                else if(nums[mid]>target){hi=mid-1;}
                                else{lo=mid+1;}
                        }
                return arr;
        }






}
