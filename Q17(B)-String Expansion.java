/* Expand the string according to the given conditions
// Given string str of the type “3(ab)4(cd)”, the task is to expand it to “abababcdcdcdcd” where integers are from the range [1, 9]. 
// Examples: 
// Input: str = “3(ab)4(cd)”  Output: abababcdcdcdcd
//  Input: str = “2(kl)3(ap)”  Output: klklapapap */

import java.util.*;
public class MyClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            String k="";
            if(c>='0' && c<='9'){
                for(int j=i+2;j<s.length();j++){
                    char m=s.charAt(j);
                    if(m==')')
                    break;
                    k+=m;
                    i++;
                }
                for(int j=0;j<(int)(c-48);j++){
                    ans+=k;
                }
            }
        }
        System.out.print(ans);
    }
}
