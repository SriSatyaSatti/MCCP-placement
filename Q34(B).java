// B) Count of strings with frequency of each character at most X and length at least Y

// Given an array arr[] of strings and integers X and Y, the task is to find the count of strings with frequency of each character at most X and length of the string at least Y.
// Examples:
// Input: arr[] = { “ab”, “derdee”, “erre” }, X = 2, Y = 4
// Output: 1
// Explanation: Strings with character frequency at most 2 and 
// length at least 4 is “erre”. Hence count is 1
// Input: arr[] = {“ag”, “ka”, “nanana”}, X = 3, Y = 2
// Output: 3

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
                if(h.get(i)<k)
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
      int y=sc.nextInt();
      for(int i=0;i<n;i++){
          if(count(s[i],k) && s[i].length()>y){
              c++;
          }
      }
      System.out.println(c);
    }
}
