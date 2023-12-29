// B)  GCD of more than two (or array) numbers
// Given an array of numbers, find GCD of the array elements. In a previous post we find GCD of two number.
// Examples:
// Input  : arr[] = {1, 2, 3}
// Output : 1
// Input  : arr[] = {2, 4, 6, 8}
// Output : 2


import java.util.*;
public class MyClass {
    static int fun(int a,int b){
        if(a<b){
            int t=a;
            a=b;
            b=t;
        }
        if(b==0)
        return a;
        else
        return fun(b,a%b);
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      int gcd=fun(a[0],a[1]);
      for(int i=1;i<n;i++){
          gcd=fun(a[i],gcd);
      }
      System.out.println(gcd);
    }
}
