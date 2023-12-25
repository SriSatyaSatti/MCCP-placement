// Missing characters to make a string Pangram
// Pangram is a sentence containing every letter in the English alphabet. Given a string, find all characters that are missing from the string, i.e., the characters that can make the string a Pangram. We need to print output in alphabetic order.
// Examples: 
// Input : welcome to geeksforgeeks
// Output : abdhijnpquvxyz

// Input : The quick brown fox jumps
// Output : adglvyz

import java.util.*;
public class MyClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Character> a=new ArrayList<>();
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            a.add(s.charAt(i));
        }
        String k="";
        for(int i=0;i<26;i++){
            char c=(char)(97+i);
            if(!a.contains(c))
            k+=c;
        }
        System.out.println(k);
    }
}
