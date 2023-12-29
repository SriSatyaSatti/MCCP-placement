// Check if all given strings are isograms or not

// Given an array arr containing N strings, the task is to check if all strings are isogram or not. If they are, print Yes, otherwise No.
// An Isogram is a word in which no letter occurs more than once.
// Examples:
// Input: arr[] = {“abcd”, “derg”, “erty”}
// Output: Yes
// Input: arr[] = {“agka”, “lkmn”}
// Output: No

import java.util.*;
public class MyClass {
    static Boolean isIsogram(String s){
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(h.containsKey(c))
            return false;
            h.put(c,1);
        }
        return true;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String s[]=new String[n];
      sc.nextLine();
      for(int i=0;i<n;i++){
          s[i]=sc.nextLine();
      }
      for(int i=0;i<n;i++){
          if(!isIsogram(s[i])){
              System.out.println("No");
              return;
          }
      }
      System.out.println("Yes");
    }
}
