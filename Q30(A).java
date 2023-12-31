// 30) A) Count of strings that does not contain any character of a given string

// Given an array arr containing N strings and a string str, the task is to find the number of strings that do not contain any character of string str.
// Examples:
// Input: arr[] = {“abcd”, “hijk”, “xyz”, “ayt”}, str=”apple”
// Output: 2
// Explanation: “hijk” and “xyz” are the strings that do not contain any character of str
// Input: arr[] = {“apple”, “banana”, “pear”}, str=”nil”
// Output: 1

import java.util.*;
public class MyClass {
    static Boolean check(String s,String k){
        ArrayList<Character> a=new ArrayList<>();
        for(int i=0;i<k.length();i++){
            a.add(k.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            if(a.contains(s.charAt(i)))
            return false;
        }
        return true;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      sc.nextLine();
      String s[]=new String[n];
      for(int i=0;i<n;i++){
          s[i]=sc.nextLine();
      }
      int c=0;
      String k=sc.nextLine();
      for(int i=0;i<n;i++){
          if(check(s[i],k))
          c++;
      }
      System.out.println(c);
    }
}
