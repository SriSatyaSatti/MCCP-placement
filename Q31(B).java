// B) Maximum difference between first and last indexes of an element in array
// Given an array of n integers. The task is to find the difference of first and last index of each distinct element so as to maximize the difference.
// Examples: 
// Input : {2, 1, 3, 4, 2, 1, 5, 1, 7}
// Output : 6
// Element 1 has its first index = 1 and last index = 7 Difference = 7 - 1 = 6
// Other elements have a smaller first and last index difference
// Input : {2, 2, 1, 1, 8, 8, 3, 5, 3} 
// Output : 2
// Maximum difference is for indexes of element 3.

import java.util.*;
public class MyClass {
    static int fun(int a[],int n){
        int r=a.length-1,l=0;
        while(l<=r){
            if(a[l]==a[r]){
                break;
            }
            l++;
            r--;
        }
        return r-l;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      int max=0,diff=0;
      for(int i=0;i<n;i++){
          diff=fun(a,a[i]);
          max=Math.max(max,diff);
      }
      System.out.println(max);
    }
}
