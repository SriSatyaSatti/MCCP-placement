// B)  Encrypt a string by repeating i-th character i times
// Given string str, the task is to encrypt the string with the given encryption algorithm. The 1st character of the string will be repeated once in the encrypted string, the 2nd character will be repeated twice, …, nth character will be repeated n times. 
// Examples: 
// Input: str = "geeks" 
// Output: geeeeekkkksssss

// Input: str = "abcd" 
// Output: abbcccdddd  

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      for(int i=0;i<s.length();i++){
          for(int j=0;j<=i;j++){
              System.out.print(s.charAt(i));
          }
      }
    }
}
