// Print all array elements occurring at least M times

// Given an array arr[] consisting of N integers and a positive integer M, the task is to find the number of array elements that occur at least M times.
// Examples:
/* Input: arr[] = {2, 3, 2, 2, 3, 5, 6, 3}, M = 2 Output: 2 3 Explanation: In the given array arr[], the element that occurs at least M number of times are {2, 3}.
// Input: arr[] = {1, 32, 2, 1, 33, 5, 1, 5}, M = 2 Output: 1 5 */

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
      int m=sc.nextInt();
      for(int i=0;i<n;i++){
          if(!h.containsKey(a[i])){
              h.put(a[i],1);
          }else{
              h.put(a[i],h.get(a[i])+1);
          }
      }
      for(Integer i:h.keySet()){
          if(h.get(i)>=m){
              System.out.println(i);
          }
      }
    }
}
