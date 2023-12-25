// B) Find GCD of most occurring and least occurring elements of given Array

// Given an array arr[] of size n, The task is to find the GCD of the highest and lowest frequency element in the given array.
// Examples:
/*Input: arr[] = {2, 2, 4, 4, 5, 5, 6, 6, 6, 6} Output: 2 Explanation: The frequency of the elements in the above array is  freq(2) = 2,  freq(4) = 2,  freq(5) = 2,  freq(6) = 4,  The minimum frequency is 2 (of elements 2, 4, and 5). So 2 will be picked as the least among 2, 4, and 5.  The largest frequency is 4 (of element 6).  Hence GCD of 2 and 6 = gcd(2, 6) is 2.
// Input: arr[] = {3, 2, 2, 44, 44, 44, 44} Output: 1*/

import java.util.*;
public class MyClass{
    static int gcd(int a,int b){
        if(b==0)
        return a;
        else
        return gcd(b,a%b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i],h.get(arr[i])+1);
            }else{
                h.put(arr[i],1);
            }
        }
        int max=0,min=Integer.MAX_VALUE;
        int a=1,b=1;
        for(Integer i:h.keySet()){
            int t=h.get(i);
            if(t>max){
                max=t;
                a=i;
            }
            if(t<min){
                min=t;
                b=i;
            }
        }
        System.out.println(gcd(a,b));
    }
}
