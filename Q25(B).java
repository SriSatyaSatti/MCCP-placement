// B)  Given a string s, reverse only all the vowels in the string and return it.
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
// Example 1:
// Input: s= "hello"
// Output: "holle"
// Example 2:
// Input: s= "AEIOU"
// Output: "UOIEA"
// Example 3:
// Input: s= "DesignGUrus"
// Output: "DusUgnGires"

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      ArrayList<Character> k=new ArrayList<>();
      k.add('a');
      k.add('e');
      k.add('i');
      k.add('o');
      k.add('u');
      String t="";
      for(int i=0;i<s.length();i++){
          char c=s.charAt(i);
          if(k.contains(c)){
              t+=c;
          }
      }
      StringBuffer b=new StringBuffer(t);
      b.reverse();
      String l=b.toString();
      String q="";
      int j=0;
      for(int i=0;i<s.length();i++){
          char c=s.charAt(i);
          if(k.contains(c)){
              q+=l.charAt(j);
              j++;
          }else{
              q+=c;
          }
      }
      System.out.println(q);
    }
}
