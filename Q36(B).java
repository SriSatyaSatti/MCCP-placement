// B) Remove duplicates from string keeping the order according to last occurrences

// Given a string, remove duplicate characters from the string, retaining the last occurrence of the duplicate characters. Assume the characters are case-sensitive.
// Examples:
// Input : geeksforgeeks 
// Output : forgeks 
// Explanation : Please note that we keep only last occurrences of repeating characters in same order as they appear in input. If we see result from right side, we can notice that we keep last ‘s’, then last ‘k’ , and so on.
// Input : hi this is sample test 
// Output : hiampl est 
// Explanation : Here, the output contains last occurrence of every character, even ” “(spaces), and removing the duplicates. Like in this example, there are 4 spaces count, so we have only the last occurrence of space in it removing the others. And there is only last occurrence of each character without repetition. 

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
        LinkedHashMap<Character,Integer> h=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(h.containsKey(c)){
                h.remove(c);
                h.put(c,1);
            }else{
                h.put(c,1);
            }
        }
        String k="";
            for(Character i:h.keySet()){
                k+=i;
            }
      System.out.println(k);
    }
}
