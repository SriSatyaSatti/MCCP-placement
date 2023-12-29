// B) Sum of all odd frequency elements in a Matrix


// Given a NxM matrix of integers containing duplicate elements. The task is to find the sum of all odd occurring elements in the given matrix. That is the sum of all such elements whose frequency is odd in the matrix.
// Examples: 
// Input : mat[] = {{1, 1, 2},
//                 {2, 3, 3},
//                 {4, 5, 3}}
// Output : 18
// The odd occurring elements are 3, 4, 5 and their number
// of occurrences are 3, 1, 1 respectively. Therefore,
// sum = 3+3+3+4+5 = 18.

// Input : mat[] = {{10, 20},
//                  {40, 40}}
// Output : 30

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int a[][]=new int[n][m];
      HashMap<Integer,Integer> h=new HashMap<>();
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              a[i][j]=sc.nextInt();
          }
      }
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              int k=a[i][j];
              if(h.containsKey(k))
              h.put(k,h.get(k)+1);
              else
              h.put(k,1);
          }
      }
      int s=0;
      for(Integer i:h.keySet()){
          if(h.get(i)%2!=0)
          s+=i*h.get(i);
      }
      System.out.println(s);
    }
}
