// 37) A) Find element in a sorted array whose frequency is greater than or equal to n/2.

// Given a sorted array of length n, find the number in array that appears more than or equal to n/2 times. It is given that such element always exists.
// Examples: 
// Input :  2 3 3 4
// Output : 3

// Input :  3 4 5 5 5 
// Output : 5

// Input : 1 1 1 2 3
// Output : 1

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
      for(int i=0;i<n;i++){
          if(!h.containsKey(a[i])){
              h.put(a[i],1);
          }else{
              h.put(a[i],h.get(a[i])+1);
          }
      }
      for(Integer i:h.keySet()){
          if(h.get(i)>=n/2){
              System.out.println(i);
          }
      }
    }
}
