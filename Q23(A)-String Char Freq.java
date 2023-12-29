// Count of strings with frequency of each character at most K

// Given an array arr[] containing N strings and an integer K, the task is to find the count of strings with the frequency of each character at most K
// Examples:
// Input: arr[] = { “abab”, “derdee”, “erre” }, K = 2
// Output: 2
// Explanation: Strings with character frequency at most 2 are “abab”, “erre”. Hence count is 2
// Input: arr[] = {“ag”, “ka”, “nanana”}, K = 3 
// Output: 1

import java.util.*;
public class MyClass {
    static Boolean count(String s,int k){
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(h.containsKey(c)){
                h.put(c,h.get(c)+1);
            }else{
                h.put(c,1);
            }
        }
            for(Character i:h.keySet()){
                if(h.get(i)==k)
                return true;
            }
            return false;
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
      int k=sc.nextInt();
      for(int i=0;i<n;i++){
          if(count(s[i],k)){
              c++;
          }
      }
      System.out.println(c);
    }
}
