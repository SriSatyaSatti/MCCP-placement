// Check if given String is Pangram or not
// Given a string Str. The task is to check if it is Pangram or not. 
// A pangram is a sentence containing every letter in the English Alphabet.
// Examples: 
/* Input: “The quick brown fox jumps over the lazy dog”  Output: is a Pangram  Explanation: Contains all the characters from ‘a’ to ‘z’] */

import java.util.*;
public class MyClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toUpperCase();
        HashMap<Character,Integer> h1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A' && c<='Z')
                h1.put(c,1);
            }
        if(h1.size()==26){
             System.out.print("YES");
        }else{
             System.out.print("NO");
        }
    }
}
