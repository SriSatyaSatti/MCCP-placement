// 35) A) Sum of all elements repeating ‘k’ times in an array
// Given an array, we have to find the sum of all the elements repeating k times in an array. We need to consider every repeating element just once in the sum.
// Examples: 
// Input : arr[] = {2, 3, 9, 9}
//             k = 1
// Output : 5
// 2 + 3 = 5

// Input : arr[] = {9, 8, 8, 8, 10, 4}
//           k = 3
// Output : 8

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
      int s=0;
      int k=sc.nextInt();
      for(Integer i:h.keySet()){
          if(h.get(i)==k)
          s+=i;
      }
      System.out.println(s);
    }
}
