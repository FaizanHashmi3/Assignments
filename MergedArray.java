import java.util.*;

public class MergedArray {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int a = 0; a< n; a++) {
            arr1[a] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int b = 0; b < m; b++) {
            arr2[b] = sc.nextInt();
        }
        sc.close();
        int n3 = m + n;

        int[] merged = new int[n3];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<n && j<m)
        {
            if (arr1[i] < arr2[j]) 
            {
                merged[k] = arr1[i];
                k++;
                i++;
            } 
            else 
            {
                merged[k] = arr2[j];
                k++;
                j++;
            }

        }
        while (i < n) {
            merged[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {
            merged[k] = arr2[j];
            j++;
            k++;
        }
        for (int p = 0; p < n3; p++) {
            System.out.print(merged[p] + " ");
        }
        // System.out.print("Hello");
    }

}
