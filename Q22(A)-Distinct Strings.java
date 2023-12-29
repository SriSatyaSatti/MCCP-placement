// Count Distinct Strings present in an array 

// Given an array of strings arr[], the task is to find the count of distinct strings present in the array.
// Examples:
// Input: arr[] = { “abcde”, “abcce”, “abcdf”, “abcde”, “abcdf” } 
// Output: 3 
// Explanation: 
// Distinct strings in the array are { “abcde”, “abcce”, “abcdf” }. 
// Therefore, the required output is 3.
// Input: arr[] = { “ab”, “abc”, “abcd”, “abcde”, “a” } 
// Output: 5 
// Explanation: 
// Distinct strings in the array are { “abcde”, “abcd”, “abc”, “ab”, “a” }. 
// Therefore, the required output is 5.

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String[] words=new String[n];
      sc.nextLine();
      for(int i=0;i<n;i++){
          words[i]=sc.nextLine();
      }
      HashSet<String> h=new HashSet<>();
      for(int i=0;i<n;i++){
          h.add(words[i]);
      }
      System.out.println(h.size());
    }
}
