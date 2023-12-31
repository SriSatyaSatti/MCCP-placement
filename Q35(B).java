// B) Most frequent word in first String which is not present in second String


// Given two string ‘S1’ and ‘S2’, the task is to return the most frequent (which is used the maximum number of times) word from ‘S1’ that is not present in ‘S2’. If more than one word is possible then print lexicographically smallest among them.
// Examples: 
// Input: S1 = “geeks for geeks is best place to learn”, S2 = “bad place” 
// Output: geeks 
// “geeks” is the most frequent word in S1 and is also not present in S2. 
// The frequency of “geeks” is 2
// Input: S1 = “the quick brown fox jumps over the lazy dog”, S2 = “the brown fox jumps” 
// Output: dog 
// All the words have frequency 1. 
// The lexicographically smallest word is “dog”

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String a=sc.nextLine();
      String b=sc.nextLine();
      String[] s1=a.split(" ");
      String[] s2=b.split(" ");
      HashMap<String,Integer> h=new HashMap<>();
      for(int i=0;i<s1.length;i++){
          String c=s1[i];
          if(h.containsKey(c))
          h.put(c,h.get(c)+1);
          else
          h.put(c,1);
      }
      ArrayList<String> k=new ArrayList<>();
      for(int i=0;i<s2.length;i++){
          k.add(s2[i]);
      }
      ArrayList<Integer> d=new ArrayList<>();
      for(String c:h.keySet()){
          d.add(h.get(c));
      }
      Collections.sort(d,Collections.reverseOrder());
      int i=0;
      while(i<d.size()){
      for(String c:h.keySet()){
          if(h.get(c)==d.get(i) && !k.contains(c)){
            System.out.println(c);
            return;
       }
      }
      i++;
     }
    }
}
