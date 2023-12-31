// 33)A) Modify a matrix by replacing each element with the maximum of its left or right diagonal sum
// Given a matrix mat[][] with dimensions M * N, the task is to replace each matrix elements with the maximum sum of its left or right diagonal.
// Examples:
// Input: mat[][] = {{5, 2, 1}, {7, 2, 6}, {3, 1, 9}}
// Output: 
// 16  9   6 
// 9 16   8
// 6   8 16

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[][]=new int[n][n];
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              a[i][j]=sc.nextInt();
          }
      }
      int t[][]=new int[n][n];
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              int cl=a[i][j],cr=a[i][j];
              int i1=i-1,j1=j-1;
              while(i1>=0 && j1>=0){
                  cl+=a[i1][j1];
                  i1--;
                  j1--;
              }
              i1=i+1;j1=j+1;
              while(i1<=n-1 && j1<=n-1){
                  cl+=a[i1][j1];
                  i1++;
                  j1++;
              }
              i1=i-1;j1=j+1;
              while(i1>=0 && j1<=n-1){
                  cr+=a[i1][j1];
                  i1--;
                  j1++;
              }
              i1=i+1;j1=j-1;
              while(i1<=n-1 && j1>=0){
                  cr+=a[i1][j1];
                  i1++;
                  j1--;
              }
              t[i][j]=Math.max(cl,cr);
          }
      }
      for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
      System.out.print(t[i][j]+" ");
      }
      System.out.println();
      }
    }
}
