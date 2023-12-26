// 17).  A) Give a N*N square matrix, return an array of its anti-diagonals. Look at the example for more details.
// Example:
// 1 2 3
// 4 5 6
// 7 8 9
// Return the following:
// [ 
//   [1],
//   [2, 4],
//   [3, 5, 7],
//   [6, 8],
//   [9]
// ]
// Input: 
// 1 2
// 3 4
// Return the following: 
// [
//   [1],
//   [2, 3],
//   [4]
// ]

import java.util.*;
public class MyClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int c=0;
        System.out.println("[");
        for(int i=0;i<2*n-1;i++){
            System.out.print("[");
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++)
                if(k+j==c){
                    System.out.print(a[j][k]+" ");
                }
            }
            System.out.println("]");
            c++;
        }
        System.out.print("]");
    }
}
