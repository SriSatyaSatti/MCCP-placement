//Check if a given string is a rotation of a palindrome				30 M

// Given a string, check if it is a rotation of a palindrome. For example your function should return true for “aab” as it is a rotation of “aba”. 
// Examples: 
// Input:  str = "aaaad"
// Output: 1  
// // "aaaad" is a rotation of a palindrome "aadaa"

// Input:  str = "abcd"
// Output: 0
// // "abcd" is not a rotation of any palindrome.

import java.util.*;
public class MyClass {
    static String rotate(String s){
        return s.substring(1,s.length())+s.charAt(0);
    }
    static Boolean isPalindrome(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
            return false;
        }
        return true;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      for(int i=0;i<s.length();i++){
          s=rotate(s);
          if(isPalindrome(s)){
              System.out.println("true");
              return;
          }
      }
      System.out.println("false");
    }
}
