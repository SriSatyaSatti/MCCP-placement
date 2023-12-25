// Count of camel case characters present in a given string

// Given a string S, the task is to count the number of camel case characters present in the given string.
// The camel case character is defined as the number of uppercase characters in the given string.
// Examples:
// Input: S = “ckjkUUYII”
// Output: 5
// Explanation: 
// Camel case characters present are U, U, Y, I and I.

// Input: S = “abcd”
// Output: 0

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A' && c<='Z')
            count++;
        }
        System.out.println(count);
    }
}
