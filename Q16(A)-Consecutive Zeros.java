// Maximum Consecutive Zeroes in Concatenated Binary String

// You are given a binary string str of length n. Suppose you create another string of size n * k by concatenating k copies of str together. What is the maximum size of a substring of the concatenated string consisting only of 0’s? Given that k > 1. 
// Examples:
/* Input : str = “110010”, k = 2  Output : 2  String becomes 110010110010 after two concatenations. This string has two zeroes. 
// Input : str = “00100110”, k = 4  Output : 3 */

import java.util.*;
public class MyClass{
    static int fun(String s){
        int max=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int c=0;
                if(s.charAt(i)=='0'){
                    c++;
                    for(int k=i+1;k<n;k++){
                        if(s.charAt(k)=='0')
                        c++;
                        else
                        break;
                    }
            }
            if(max<c){
                max=c;
            }
        }
            return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        String t="";
        for(int i=0;i<n;i++){
            t+=s;
        }
        System.out.print(fun(t));
    }
}
