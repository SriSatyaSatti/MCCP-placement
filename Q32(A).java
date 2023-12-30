// 32) A) Most similar string

// Given a string str and an array of strings arr[] of size N, the task is to print a string from arr[], which has maximum count of matching characters with str.
// Examples:
// Input: str = “vikas”, N = 3, arr[] = [“preeti”, “khusbu”, “katherina”] 
// Output: “katherina” 
// Explanation: 
// Number of similar characters between Str and each string in D[ ] are,  
// “preeti” = 1 
// “khusbu” = 2 
// “katherina” = 3 
// Hence, “katherina” has maximum matching characters.
// Input: str = “gfg”, N = 3, arr[] = [“goal”, “fog”, “abc”] 
// Output: “fog” 
// Explanation:
// Number of similar characters between Str and each string in D[ ] are,  
// “goal” = 1 
// “fog” = 2 
// “abc” = 0 


import java.util.*;
public class MyClass {
    static int matching(String a,String b){
        int k1[]=new int[26];
        int k2[]=new int[26];
        for(int i=0;i<a.length();i++){
            k1[a.charAt(i)-'a']++;
        }
        for(int i=0;i<b.length();i++){
            k2[b.charAt(i)-'a']++;
        }
        int c=0;
        for(int i=0;i<26;i++){
            if((k1[i]>=k2[i] || k2[i]>=k1[i]) && k1[i]!=0 && k2[i]!=0)
            c++;
        }
        return c;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      sc.nextLine();
      String words[]=new String[n];
      for(int i=0;i<n;i++){
          words[i]=sc.nextLine();
      }
      String s=sc.nextLine();
      int max=0;
      String ans="";
      for(int i=0;i<n;i++){
          int m=matching(words[i],s);
          if(max<m){
              max=m;
              ans=words[i];
          }
      }
      System.out.println(ans);
    }
}
