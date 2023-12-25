// Q4)  A) Check whether the given number is Euclid Number or not
// Given a positive integer n, the task is to check if it is Euclid Number or not. Print ‘YES’ if the given number is Euclid Number otherwise print ‘NO’.
// Euclid number : In Mathematics, Euclid numbers are integers of the form – 
// E=P#+1 
/* where P# is product of first n prime numbers. The first few Euclid numbers are-  */
// 3, 7, 31, 211, 2311, 30031, 510511, 9699691, ……….
// Input: N = 31
// Output: YES
// 31 can be expressed in the form of 
// pn# + 1 as p3# + 1
// (First 3 prime numbers are 2, 3, 5 and their product is 30 )

// Input: N = 43
// Output: NO
// Cannot be expressed in the form of pn# + 1

import java.util.*;
public class MyClass{
    static Boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=1;
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                p*=i;
                if(p+1==n){
                    System.out.print("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
