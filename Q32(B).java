// B) Count number of free cell present in the Matrix
// Given a Matrix size N*N and an integer K. Initially, the matrix contains only 0. You are given K tasks and for each task, you are given two coordinates (r, c). Where coordinates (r, c) denotes the rth row and the cth column of the given matrix. You have to perform each task sequentially in the given order. For each task, You have to put 1 in all rth row cells and all the cth column cells. After each task, You have to calculate the number of 0 present in the matrix and return it.
// Examples:
// Input: N = 3, K = 3
// 1 1
// 1 2
// 2 1
// Output: 4 2 1
// Explanation: After 1st Operation, all the cells of the 2nd row and  2nd column will be filled by 1. So, the remaining cell with the value 0 will be 4. After 2nd operation, all the second row and all the third columns will be filled by 1. So, the remaining cell with value will be 2. After 3rd operation number of cells having the value 0 will be 1.
// Input: N = 2, K = 2
// 0 1
// 0 0
// Output: 1 0
// Explanation: After 1st operation, all the cells of the 1st row and 2nd column will be filled by 1. So, the remaining cell with the value 0 will be 1. After 2nd operation, all the cells of the 1st row and 1st column will be filled by 1. So, the remaining cell with the value 0 will be 0.


import java.util.*;
public class MyClass {
    static int count(int[][] a,int n){
      int c=0;
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              if(a[i][i]==0){
                  c++;
              }
          }
      }
      return c;
    }
    static int[][] change(int[][] a,int n,int k1,int k2){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==k1 || j==k2)
                a[i][j]=1;
            }
        }
        return a;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int a[][]=new int[n][n];
      int t[][]=new int[k][2];
      for(int i=0;i<k;i++){
          for(int j=0;j<2;j++){
              t[i][j]=sc.nextInt();
          }
      }
      for(int i=0;i<k;i++){
          for(int j=0;j<2;j++){
              a=change(a,n,i,j);
          }
          System.out.print(count(a,n)+" ");
      }
    }
}
