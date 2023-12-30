// B) Remove even frequency characters from the string

// Given a string ‘str’, the task is to remove all the characters from the string that have even frequencies.
// Examples: 
// Input: str = "aabbbddeeecc"
// Output: bbbeee
// The characters a, d, c have even frequencies
// So, they are removed from the string.

// Input: str = "zzzxxweeerr"
// Output: zzzweee

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      HashMap<Character,Integer> h=new HashMap<>();
      for(int i=0;i<s.length();i++){
          char c=s.charAt(i);
          if(h.containsKey(c))
          h.put(c,h.get(c)+1);
          else
          h.put(c,1);
      }
      String k="";
      for(Character l:h.keySet()){
          if(h.get(l)%2!=0)
          for(int i=0;i<h.get(l);i++)
          k+=l;
      }
      System.out.println(k);
    }
}
