// Count words in a given string


// Given a string, count the number of words in it. The words are separated by the following characters: space (‘ ‘) or new line (‘\n’) or tab (‘\t’) or a combination of these.

// Input: S = "abc def"
// Output: 2

// Input: S = "a\nyo\n"
// Output: 2

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String words[]=s.split(" ");
      System.out.print(words.length);
    }
}
