
// Print all characters of string whose frequency is a power of K

// Given string str of size N, the task is to print the characters of string whose frequency is a power of K in a lexicographically sorted order.
// Examples:
// Input: str = “aaacbb” K = 2
// Output: bbc
// Explanation: Frequency of a is 3 which is not the power of 2. Frequency of c is 1 and frequency of b is 2 which are the power of 2. 
// Input: str = “geeksgeekgeeks” K = 3
// Output: eeeeeegggkkk

import java.util.*;
public class MyClass {
    static Boolean isPower(int n,int k){
        int i=1;
        while(i<=n){
            if(i==n)
            return true;
            i=i*k;
        }
        return false;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int k=sc.nextInt();
      HashMap<Character,Integer> h=new HashMap<>();
      for(int i=0;i<s.length();i++){
          char c=s.charAt(i);
          if(h.containsKey(c))
          h.put(c,h.get(c)+1);
          else
          h.put(c,1);
      }
      ArrayList<Character> ans=new ArrayList<>();
      for(int i=0;i<s.length();i++){
          char c=s.charAt(i);
          if(isPower(h.get(c),k))
          ans.add(c);
      }
      Collections.sort(ans);
      System.out.println(ans.toString());
    }
}
