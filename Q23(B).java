// B) Count all elements in the array which appears at least K times after their first occurrence

// Given an array arr[] of N integer elements and an integer K. The task is to count all distinct arr[i] such that arr[i] appears at least K times in the index range i + 1 to n – 1.
// Examples: 
// Input: arr[] = {1, 2, 1, 3}, K = 1 
// Output: 1 
// arr[0] = 1 is the only element that appears at least once in the index range [1, 3] i.e. arr[2]
// Input: arr[] = {1, 2, 3, 2, 1, 3, 1, 2, 1}, K = 2 
// Output: 2  

import java.util.*;
public class MyClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(h.containsKey(a[i])){
                h.put(a[i],h.get(a[i])+1);
            }else{
                h.put(a[i],1);
            }
        }
        int c=0;
        int k=sc.nextInt();
        for(Integer i:h.keySet()){
            if(h.get(i)==k+1)
            c++;
        }
        System.out.print(c);
    }
}
