// A)Find resultant string after concatenating uncommon characters of given strings

// Given two strings S1 and S2. The task is to concatenate uncommon characters of the S2 to S1  and return the resultant string S1 .
// Examples: 
/* Input: S1 = “aacdb”, S2 = “gafd” Output: “cbgf”
// Input: S1 = “abcs”, S2 = “cxzca”; Output: “bsxz” */
import java.util.*;
public class MyClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int a[]=new int[26];
        for(int i=0;i<s1.length();i++){
            a[s1.charAt(i)-97]++;
        }
        for(int i=0;i<s2.length();i++){
            a[s2.charAt(i)-97]++;
        }
        String s="";
        for(int i=0;i<26;i++){
            if(a[i]==1){
                s+=(char)(i+97);
            }
        }
        System.out.print(s);
    }
}
