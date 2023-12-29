// Find all matrix elements which are minimum in their row and maximum in their column

// Given a matrix mat[][] of size M * N, the task is to find all matrix elements which are minimum in their respective row and maximum in their respective column. If no such element is present, print -1.
// Examples:
// Input: mat[][] = {{1, 10, 4}, {9, 3, 8}, {15, 16, 17}}
// Output: 15
// Explanation:
// 15 is the only element which is maximum in its column {1, 9, 15} and minimum in its row {15, 16, 17}.
// Input: m[][] = {{10, 41}, {3, 5}, {16, 2}}
// Output: -1

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int m=sc.nextInt();
      int n=sc.nextInt();
      int a[][]=new int[m][n];
      for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              a[i][j]=sc.nextInt();
          }
      }
      int row[]=new int[m];
      int col[]=new int[n];
      for(int i=0;i<m;i++){
          int min=Integer.MAX_VALUE;
          for(int j=0;j<n;j++){
              min=Math.min(min,a[i][j]);
          }
          row[i]=min;
      }
      for(int i=0;i<n;i++){
          int max=Integer.MIN_VALUE;
          for(int j=0;j<m;j++){
              max=Math.max(max,a[j][i]);
          }
          col[i]=max;
      }
      for(int i=0;i<m && i<n;i++){
          if(row[i]==col[n-1-i]){
              System.out.println(row[i]);
              return;
          }
      }
      System.out.println(-1);
    }
}
