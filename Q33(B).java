// B) Print characters in decreasing order of frequency
// Given string str, the task is to print the characters in decreasing order of their frequency. If the frequency of two characters is the same then sort them in descending order alphabetically.
// Examples: 
//  Input: str = “geeksforgeeks” 
// Output: 
// e – 4 
// s – 2 
// k – 2 
// g – 2 
// r – 1 
// o – 1 
// f – 1
// Input: str = “bbcc” 
// Output: 
// c – 2 
// b – 2

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
      ArrayList<Integer> a=new ArrayList<>();
      for(Character c:h.keySet()){
          a.add(h.get(c));
      }
      Collections.sort(a,Collections.reverseOrder());
      int i=0;
      while(i<a.size()){
      for(Character c:h.keySet()){
          if(h.get(c)==a.get(i)){
            System.out.println(c+" - "+a.get(i));
            i++;
       }
      }
     }
    }
}
