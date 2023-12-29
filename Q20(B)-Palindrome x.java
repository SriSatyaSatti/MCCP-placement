// Check if String formed by first and last X characters of a String is a Palindrome

// Given a string str and an integer X. The task is to find whether the first X characters of both string str and reversed string str are same or not. If it is equal then print true, otherwise print false.

// Examples:
// Input: str = abcdefba, X = 2
// Output: true
// Explanation: 
// First 2 characters of both string str and reversed string str are same.
// Input: str = GeeksforGeeks, X = 3
// Output: false

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int x=sc.nextInt();
      for(int i=0;i<x;i++){
          if(s.charAt(i)!=s.charAt(s.length()-1-i)){
              System.out.println("false");
              return;
          }
      }
      System.out.println("true");
    }
}
