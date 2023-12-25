// A)	Check if max occurring character of one string appears same no. of times in other

// Given two strings, we need to take the character which has the maximum occurrence in the first string, and then we have to check if that particular character is present in the second string the same number of times as it is present in the first string.
// Examples: 
 
// Input : s1 = "sssgeek", s2 = "geeksss"
// Output : Yes
// Max occurring character in s1 is
// 's'. It occurs same number of times
// in s2.

// Input :  geekyarticle
//          gfggfggfg
// Output : No

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
        int max=0;
        char ans=' ';
        for(Character i:h1.keySet()){
            if(max<h1.get(i)){
                max=h1.get(i);
                ans=i;
            }
        }
        if(!h2.containsKey(ans) || h2.get(ans)!=max){
            System.out.print("NO");
        }else{
            System.out.print("Yes");
        }
    }
}
