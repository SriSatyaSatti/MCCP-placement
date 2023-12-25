// Q12) A) Given an array of words and a string, we need to count all words that are present in given string. 
// Examples: Input : words[] = { "welcome", "to", "geeks", "portal"}
//             str = "geeksforgeeks is a computer science portal for geeks."
// Output :  2
// Two words "portal" and "geeks" is present in str.

// Input : words[] = {"Save", "Water", "Save", "Yourself"}
//         str     = "Save"
// Output :1

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      sc.nextLine();
      ArrayList<String> k=new ArrayList<>();
      for(int i=0;i<n;i++){
          k.add(sc.nextLine());
      }
      int c=0;
      String s=sc.nextLine();
      String words[]=s.split(" ");
      for(int i=0;i<words.length;i++){
          if(k.contains(words[i]))
          c++;
      }
      System.out.print(c);
    }
}
