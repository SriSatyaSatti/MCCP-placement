// Check if frequency of character in one string is a factor or multiple of frequency of same character in other string

// Given two strings, the task is to check whether the frequencies of a character(for each character) in one string are multiple or a factor in another string. If it is, then output “YES”, otherwise output “NO”.
// Examples: 
/* Input: s1 = “aabccd”, s2 = “bbbaaaacc”  Output: YES  Frequency of ‘a’ in s1 and s2 are 2 and 4 respectively, and 2 is a factor of 4  Frequency of ‘b’ in s1 and s2 are 1 and 3 respectively, and 1 is a factor of 3  Frequency of ‘c’ in s1 and s2 are same hence it also satisfies.  Frequency of ‘d’ in s1 and s2 are 1 and 0 respectively, but 0 is a multiple of every number, hence satisfied.  Hence, the answer YES.

// Input: s1 = “hhdwjwqq”, s2 = “qwjdddhhh”  Output: NO */

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
            if(h2.get(i)%h1.get(i)!=0){
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
    }
}
