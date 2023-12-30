// 28) A) Modify a string by circularly shifting each character to the right by respective frequencies

// Given a string S consisting of lowercase English alphabets, the task is to right shift each character of the given string S circularly by its frequency.
// Circular shifting of characters refers to shifting character ‘z’ to ‘a’, as its next character.
// Examples:
// Input: S = “geeksforgeeks”
// Output: iiimugpsiiimu 
// Explanation:
// Following changes are made on the string S:

// 1.	Frequency of ‘g’ is 2. Therefore, shifting the character ‘g’ by 2 becomes ‘i’.
// 2.	Frequency of ‘e’ is 4. Therefore, shifting the character ‘e’ by 4 becomes ‘i’.
// 3.	Frequency of ‘k’ is 2. Therefore, shifting the character ‘k’ by 2 becomes ‘m’.
// 4.	Frequency of ‘s’ is 2. Therefore, shifting the character ‘s’ by 2 becomes ‘u’.
// 5.	Frequency of ‘f’ is 1. Therefore, shifting the character ‘f’ by 1 becomes ‘g’.
// 6.	Frequency of ‘o’ is 1. Therefore, shifting the character ‘o’ by 1 becomes ‘p’.
// 7.	Frequency of ‘r’ is 1. Therefore, shifting the character ‘r’ by 1 becomes ‘s’.
// After the above shifting of characters, the string modifies to “iiimugpsiiimu”.
// Input: S = “aabcadb”
// Output: ddddded
// // 

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
      for(int i=0;i<s.length();i++){
          char c=s.charAt(i);
          k+=(char)((int)c+h.get(c));
      }
      System.out.println(k);
    }
}
