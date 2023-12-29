/* Given an integer array A of size N. You need to check that whether there exist a element which is strictly greater than all the elements on left of it and strictly smaller than all the elements on right of it.If it exists return 1 else return 0.
NOTE:  Do not consider the corner elements i.e A[0] and A[N-1] as the answer.
Problem Constraints: 3 <= N <= 105
1 <= A[i] <= 109
Input Format: First and only argument is an integer array A containing N integers.
Output Format : Return 1 if there exist a element that is strictly greater than all the elements on left of it and strictly smaller than all the elements on right of it else return 0.
Example Input
Input 1:  A = [5, 1, 4, 3, 6, 8, 10, 7, 9]
Input 2:  A = [5, 1, 4, 4]
Example Output:
Output 1: 1
Output 2: 0 */


import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      for(int i=1;i<n;i++){
          if(a[i]>a[i-1]){
              int j=i+1;
              for(j=i+1;j<n-1;j++){
                  if(a[j]>=a[j+1])
                  break;
              }
              if(j==n)
              {
                  System.out.println(1);
                  return;
              }
          }
      }
      System.out.println(0);
    }
}
