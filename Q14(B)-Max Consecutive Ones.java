// B)	Max Consecutive Ones

// Given an array A, find the maximum number of consecutive 1s in the array.
// Examples
// A: [1, 1, 3, 2, 3, 1, 1, 1]
// Max consecutive 1s: 3

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int c=0;
                if(a[i]==1){
                    c++;
                    for(int k=i+1;k<n;k++){
                        if(a[k]==1)
                        c++;
                        else
                        break;
                    }
            }
            if(max<c){
                max=c;
            }
        }
        System.out.println(max);
    }
}
