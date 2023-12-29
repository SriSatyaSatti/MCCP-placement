// 29) A) Program to check if all characters have even frequency

// Given a string S consisting only of lowercase letters check if the string has all characters appearing even times. 
// Examples:
// Input : abaccaba 
// Output : Yes 
// Explanation: ‘a’ occurs four times, ‘b’ occurs twice, ‘c’ occurs twice and the other letters occur zero times.
// Input:  hthth 
// Output : No

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      HashMap<Character> h=new HashMap<>();
      for(int i=0;i,s.length();i++){
          char c=s.charAt(i);
          if(h.containsKey(c)){
              h.put(c,h.get(c)+1);
          }
          else{
              h.put(c,1);
          }
      }
      for(Character c:h.keySet()){
          if(h.get(c)%2!=0){
              System.out.println("No");
              return;
          }
      }
      System.out.println("Yes");
    }
}
