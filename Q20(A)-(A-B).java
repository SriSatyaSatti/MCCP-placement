// Find elements which are present in first array and not in second

// Given two arrays, the task is that we find numbers which are present in first array, but not present in the second array. 
// Examples : 
// Input : a[] = {1, 2, 3, 4, 5, 10};
//     b[] = {2, 3, 1, 0, 5};
// Output : 4 10    
// 4 and 10 are present in first array, but
// not in second array.

// Input : a[] = {4, 3, 5, 9, 11};
//         b[] = {4, 9, 3, 11, 10};
// Output : 5  

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int m=sc.nextInt();
      int n=sc.nextInt();
      ArrayList<Integer> a=new ArrayList<>();
      ArrayList<Integer> b=new ArrayList<>();
      for(int i=0;i<m;i++){
          a.add(sc.nextInt());
      }
      for(int i=0;i<n;i++){
          b.add(sc.nextInt());
      }
      for(int i=0;i<m;i++){
          if(!b.contains(a.get(i)))
           System.out.print(a.get(i)+" ");
      }
    }
}
