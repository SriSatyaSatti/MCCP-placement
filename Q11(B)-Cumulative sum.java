// B)	Cumulative Sum

// The cumulative sum of an array at index i is defined as the sum of all elements of the array from index 0 to index i.
// Examples
// Initial Array: [1, 2, 3, 4]
// Cumulative Sum: [1, 3, 6, 10]
// Initial Array: [1, 1, 1, 1, 1]
// Cumulative Sum: [1, 2, 3, 4, 5]
// Initial Array: [1, 3, 5, 7, 9]
// Cumulative Sum: [1, 4, 9, 16, 25]
// Given an array, return its cumulative sum.

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int s=0;
        System.out.print(a[0]+" ");
        for(int i=1;i<n;i++){
            a[i]=a[i]+a[i-1];
            System.out.print(a[i]+" ");
        }
    }
}
