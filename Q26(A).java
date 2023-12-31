// 26) A) Given an array of strings words and two different strings that already exist in the array word1 and word2, return the shortest distance between these two words in the list.
// Example 1:
// Input: words = ["the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"], word1 = "fox", word2 = "dog"
// Output: 5
// Explanation: The distance between "fox" and "dog" is 5 words.
// Example 2:
// Input: words = ["a", "c", "d", "b", "a"], word1 = "a", word2 = "b"
// Output: 1
// Explanation: The shortest distance between "a" and "b" is 1 word

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      ArrayList<String> a=new ArrayList<>();
      sc.nextLine();
      for(int i=0;i<n;i++){
          a.add(sc.nextLine());
      }
      String word1=sc.nextLine();
      String word2=sc.nextLine();
      System.out.println(Math.abs(a.indexOf(word2)-a.lastIndexOf(word1)));
    }
}
