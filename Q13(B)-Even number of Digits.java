// Even Number of Digits

// Given an array of integers, find the elements which have an even number of digits.
// Example
// Array: [42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442]
// Answer: 42, 5775, 34, 45, 3556
// The order of the returned elements should be the same as the order of the initial array.

import java.util.*;
public class MyClass {
    static Boolean isEvenDig(int n){
        int c=0;
        while(n!=0){
            c++;
            n/=10;
        }
        if(c%2==0)
        return true;
        return false;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(isEvenDig(a[i]))
                System.out.println(a[i]);
        }
    }
}
