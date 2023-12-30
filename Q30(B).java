// B) Given an m x n matrix, find all common elements present in all rows in O(mn) time and one traversal of matrix.
// Example: 
// Input:
// mat[4][5] = {{1, 2, 1, 4, 8},
//              {3, 7, 8, 5, 1},
//              {8, 7, 7, 3, 1},
//              {8, 1, 2, 7, 9},
//             };

// Output: 
// 1 8 or 8 1
// 8 and 1 are present in all rows.

import java.util.*;
public class MyClass {
    static int[] fun(int[] a,int[] b){
        HashSet<Integer> h=new HashSet<>();
        int c=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j])
                h.add(a[i]);
            }
        }
        for(int i=0;i<b.length;i++){
            for(int j=0;j<a.length;j++){
                if(b[i]==a[j])
                h.add(b[i]);
            }
        }
        int[] ans=new int[h.size()];
        for(Integer i:h){
            ans[c++]=i;
        }
        return ans;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int m=sc.nextInt();
      int n=sc.nextInt();
      int a[][]=new int[m][n];
      for(int i=0;i<m;i++){
          for(int j=0;j<n;j++)
          a[i][j]=sc.nextInt();
      }
      int common[]=fun(a[0],a[1]);
      for(int i=1;i<m;i++){
          common=fun(a[i],common);
      }
      for(int i=0;i<common.length;i++)
      System.out.println(common[i]);
    }
}
