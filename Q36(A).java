// 36) A) Find element with highest frequency in given nested Array
// Given an array arr[] of N integers. The task is to create a frequency array freq[] of the given array arr[] and find the maximum element of the frequency array. If two elements have the same frequency in the array freq[], then return the element which has a smaller value.
// Examples:
// Input: arr[] = {1, 1, 1, 2, 3, 2, 2, 3, 5, 5, 5, 5, 4, 4, 4, 4, 4}; 
// Output: 3 
// Explanation: 
// frequency of elements is given by: 
// val -> freq[] 
// 1 -> 3 
// 2 -> 3 
// 3 -> 2 
// 4 -> 5 
// 5 -> 4 
// Element 3 has the maximum frequency in the frequency array.
// Input: arr[] = { 3, 5, 15, 51, 15, 14, 14, 14, 14, 4}; 
// Output: 1 
// Explanation: 
// frequency of elements is given by: 
// val -> freq[] 
// 3 -> 1 
// 4 -> 1 
// 5 -> 1 
// 14 -> 4 
// 15 -> 2 
// 51 -> 1 
// Element 1 has the maximum frequency in the frequency array. 

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      HashMap<Integer,Integer> h=new HashMap<>();
      for(int i=0;i<n;i++){
          int c=a[i];
          if(h.containsKey(c))
          h.put(c,h.get(c)+1);
          else
          h.put(c,1);
      }
      int max=0;
      for(Integer i:h.keySet()){
          max=Math.max(max,h.get(i));
      }
      System.out.println(max);
    }
}
