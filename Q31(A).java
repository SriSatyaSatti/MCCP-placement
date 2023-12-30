// 31) A) Count of sticks required to represent the given string

// Given a string str of uppercase alphabets and numbers, the task is to find the number of matchsticks required to represent it.

// Input: str = “ABC2” 
// Output: 22 
// Explanation: 
// 6 sticks are required to represent A, 
// 7 sticks are required to represent B, 
// 4 sticks are required to represent C, 
// 5 sticks are required to represent 2. 
// Therefore the total number of matchsticks required is 6 + 7 + 4 + 5 = 22.
// Input: str = “GEEKSFORGEEKS” 
// Output: 66 
// Explanation: 
// 6 sticks are required to represent G, 
// 5 sticks are required to represent E, 
// 4 sticks are required to represent K, 
// 5 sticks are required to represent S, 
// 4 sticks are required to represent F, 
// 6 sticks are required to represent O, 
// 6 sticks are required to represent R. 
// Therefore the total number of matchsticks required is 6 + 5 + 5 + 4 + 5 + 4 + 6 + 6 + 6 + 5 + 5 + 4 + 5 = 17. 


import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int a[] = { 6, 7, 4, 6, 5, 4, 6,
                     5, 2, 4, 4, 3, 6, 6,
                     6, 5, 7, 6, 5, 3, 5,
                     4, 6, 4, 3, 4 };
     
      int n[] = { 6, 2, 5, 5, 4, 5, 6,
                     3, 7, 6 };
      String s=sc.nextLine();
      int sum=0;
      for(int i=0;i<s.length();i++){
          char c=s.charAt(i);
          if(c>='a' && c<='z'){
              sum+=a[c-'a'];
          }else{
              sum+=n[c-'0'];
          }
      }
      System.out.println(sum);
    }
}
