// Count of elements in Array which are present K times & their double isn’t present

// Given an array arr[] of N integers, the task is to find the count of elements in the array that are present K times and their double are not present in the array. 
// Examples:
// Input: arr[] = {10, 6, 12, 8, 10, 8}, K = 2
// Output: 2
// Explanation: 10 is a valid number since it appears exactly two times and 20 does not appear in array.
// 8 is a valid number since it appears two times and 16 does not appear in array.
// Input: arr[] = {1, 3, 5, 3}, K = 3
// Output: 0
// Explanation: No element in the given array satisfy the condition.
// Input: arr[]={1,3,5,3,4,3} K=3
// Output:0

// Input: arr[] = {1, 2, 2, 3, 3, 4}, K = 2
// Output: 1
// Explanation: Only 3 is valid element.
// Though 2 is present twice but its double is also present.

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      HashMap<Integer,Integer> h=new HashMap<>();
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      int k=sc.nextInt();
      for(int i=0;i<n;i++){
          if(h.containsKey(a[i]))
          h.put(a[i],h.get(a[i])+1);
          else
          h.put(a[i],1);
      }
      int c=0;
      for(Integer i:h.keySet()){
          if(h.get(i)==k){
              if(!h.containsKey(i*2)){
                  c++;
              }
          }
      }
      System.out.println(c);
    }
}
