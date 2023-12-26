// Rearrange array such that even positioned are greater than odd

// Given an array A of n elements, sort the array according to the following relations :  
// A[i]>=A[i-1], if i is even.  
// A[i]<=A[i-1], if i is odd. 
// Print the resultant array.
// Examples :  
// Input : A[] = {1, 2, 2, 1}
// Output :  1 2 1 2
// Explanation : 
// For 1st element, 1  1, i = 2 is even.
// 3rd element, 1  1, i = 4 is even.

// Input : A[] = {1, 3, 2}
// Output : 1 3 2
// Explanation : 
// Here, the array is also sorted as per the conditions. 
// 1  1 and 2 < 3.

import java.util.*;
public class MyClass {
    static ArrayList<Integer> move(int a[],int n){
        Arrays.sort(a);
        ArrayList<Integer> t=new ArrayList<>();
        int l=0,r=n-1;
        while(l<r){
            t.add(a[l]);
            t.add(a[r]);
            l++;
            r--;
        }
        if(l==r)
        t.add(a[l]);
        return t;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      ArrayList<Integer> t=new ArrayList<>();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      t=move(a,n);
      for(Integer x:t){
          System.out.println(x+" ");
      }
    }
}
