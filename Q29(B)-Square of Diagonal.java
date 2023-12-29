// B) Squares of Matrix Diagonal Elements


// You have given an integer matrix with odd dimensions. Find the square of the diagonal elements on both sides.
// Examples:
// Input  :  1 2 3
//          4 5 6
//          7 8 9
// Output :  Diagonal one: 1 25 81
//          Diagonal two: 9 25 49
// Input  :  2 5 7  
//          3 7 2
//          5 6 9
// Output :  Diagonal one : 4 49 81
//          Diagonal two : 49 49 25

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[][]=new int[n][n];
      String s1="",s2="";
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              a[i][j]=sc.nextInt();
          }
      }
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              if(i==j){
                  s1+=a[i][j]*a[i][j]+" ";
              }
              if(i+j==n-1){
                  s2+=a[i][j]*a[i][j]+" ";
              }
          }
      }
      System.out.println("Diagonal one: "+s1+"\n"+"Diagonal two: "+s2);
    }
}
