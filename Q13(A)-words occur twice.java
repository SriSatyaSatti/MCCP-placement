// Count words that appear exactly two times in an array of words

// Given an array of n words. Some words are repeated twice, we need to count such words. 
// Examples: 
// Input : s[] = {"hate", "love", "peace", "love", 
//               "peace", "hate", "love", "peace", 
//               "love", "peace"};
// Output : 1
// There is only one word "hate" that appears twice

// Input : s[] = {"Om", "Om", "Shankar", "Tripathi", 
//                 "Tom", "Jerry", "Jerry"};
// Output : 2
// There are two words "Om" and "Jerry" that appear
// twice.

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String w[]=new String[n];
        HashMap<String,Integer> h1=new HashMap<>();
        for(int i=0;i<n;i++){
            w[i]=sc.nextLine();
        }
        for(int i=0;i<n;i++){
            String c=w[i];
            if(h1.containsKey(c)){
                h1.put(c,h1.get(c)+1);
            }else{
                h1.put(c,1);
            }
        }
        int c=0;
        for(String i:h1.keySet()){
            if(h1.get(i)==2)
            c++;
        }
        System.out.println(c);
    }
}
