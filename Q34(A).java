// 34) A) Count of unique rows in a given Matrix

// Given a 2D matrix arr of size N*M containing lowercase English letters, the task is to find the number of unique rows in the given matrix.
// Examples:  
// Input:  arr[][]= { {‘a’, ‘b’, ‘c’, ‘d’},  
//                           {‘a’, ‘e’, ‘f’, ‘r’},  
//                           {‘a’, ‘b’, ‘c’, ‘d’},  
//                           {‘z’, ‘c’, ‘e’, ‘f’} }
// Output: 2
// Explanation: The 2nd and the 4th row are unique.
// Input: arr[][]={{‘a’, ‘c’},  
//                       {‘b’, ‘d’},  
//                       {‘e’, ‘f’}}
// Output: 3

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      sc.nextLine();
      String words[]=new String[n];
      for(int i=0;i<n;i++){
          words[i]=sc.nextLine();
      }
      HashMap<String,Integer> h=new HashMap<>();
      for(int i=0;i<n;i++){
          if(h.containsKey(words[i]))
          h.put(words[i],h.get(words[i])+1);
          else
          h.put(words[i],1);
      }
      int c=0;
      for(String k:h.keySet())
      if(h.get(k)==1)
      c++;
      System.out.println(c);
    }
}
