// Find one extra character in a string

// Given two strings which are of lengths n and n+1. The second string contains all the character of the first string, but there is one extra character. Your task to find the extra character in the second string.
// Examples : 
// Input : string strA = "abcd";
//         string strB = "cbdae";
// Output : e
// string B contain all the element 
// there is a one extra character which is e

// Input : string strA = "kxml";
//         string strB = "klxml";
// Output : l
// string B contain all the element 
// there is a one extra character which is l

import java.util.*;
public class MyClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        HashMap<Character,Integer> h1=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if(h1.containsKey(c)){
                h1.put(c,h1.get(c)+1);
            }else{
                h1.put(c,1);
            }
        }
        String s2=sc.nextLine();
        HashMap<Character,Integer> h2=new HashMap<>();
        for(int i=0;i<s2.length();i++){
            char c=s2.charAt(i);
            if(h2.containsKey(c)){
                h2.put(c,h2.get(c)+1);
            }else{
                h2.put(c,1);
            }
        }
        for(Character i:h2.keySet()){
            if(!h1.containsKey(i) || h1.get(i)<h2.get(i)){
                System.out.print(i);
            }
        }
    }
}
