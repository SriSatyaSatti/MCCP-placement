// Count smaller elements on Right side

// Given an unsorted array arr[] of distinct integers, construct another array countSmaller[] such that countSmaller[i] contains the count of smaller elements on the right side of each element arr[i] in the array.
// Examples: 
/* Input:   arr[] =  {12, 1, 2, 3, 0, 11, 4} Output:  countSmaller[]  =  {6, 1, 1, 1, 0, 1, 0} 
// Input:   arr[] =  {5, 4, 3, 2, 1} Output:  countSmaller[]  =  {4, 3, 2, 1, 0} */

import java.util.*;
public class MyClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int t[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j])
                c++;
            }
            t[i]=c;
        }
        for(int i=0;i<n;i++)
        System.out.print(t[i]+" ");
    }
}
