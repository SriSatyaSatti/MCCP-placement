/* Sum of all Perfect numbers lying in the range [L, R]
// Given two numbers L, R which signifies the range [L, R], the task is to find the sum of all perfect numbers lying in the range [L, R]. 

// Examples:   
//   Input: L = 6, R = 10  Output: 6  Explanation:  From 6 to 10, the only perfect number is 6. Input: L = 6, R = 28  Output: 34  Explanation:  There are two perfect numbers in the range [6, 28]. They are, {6, 28}  6 + 28 = 34. */

import java.util.*;
public class MyClass{
    static Boolean isPerfect(int n){
        int s=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                s+=i;
                if(n/i!=i)
                s+=(n/i);
            }
        }
        if(s-n==n)
        return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int s=0;
        for(int i=l;i<=r;i++){
            if(isPerfect(i))
                s+=i;
        }
        System.out.print(s);
    }
}
