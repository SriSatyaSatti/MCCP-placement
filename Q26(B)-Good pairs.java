// B)  Given an array of integers nums, return the number of good pairs.
// A pair (i, j) is called good if nums[i] == nums[j] and i < j.
// Example 1:
// Input: nums = [1,2,3,1,1,3]
// Output: 4
// Explanation: There are 4 good pairs, here are the indices: (0,3), (0,4), (3,4), (2,5).
// Example 2:
// Input: nums = [1,1,1,1]
// Output: 6
// Explanation: Each pair in the array is a 'good pair'.
// Example 3:
// Input: words = nums = [1,2,3]
// Output: 0
// Explanation: No number is repeating.

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      int c=0;
      for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
              if(a[i]==a[j])
              c++;
          }
      }
      System.out.println(c);
    }
}
