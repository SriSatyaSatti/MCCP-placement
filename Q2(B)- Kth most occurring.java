// Find Kth most occurring element in an Array

/* Given an array of integers arr[] of size N and a number K, the task is to find the Kth most occurring element in this array. Note: If there are more than one numbers in the array with the same frequency, then both are considered to be at the same level of occurrence. Therefore print both the numbers. 
// Examples: 
// Input: arr[] = {1, 2, 2, 2, 4, 4, 4, 5, 5, 5, 5, 5, 7, 7, 8, 8, 8, 8}, K = 1  Output: 5  Explanation:  The occurrence of the elements are as follows:  1 – 1  2 – 3  4 – 3  5 – 5  7 – 2  8 – 4  Clearly, 5 is the most occurring element in the array. 
// Input: arr[] = {1, 2, 2, 2, 4, 4, 4, 4, 5, 5, 5, 5, 5, 7, 7, 8, 8, 8, 8}, K = 3  Output: 2 */

import java.util.*;
public class MyClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(h.containsKey(a[i])){
                h.put(a[i],h.get(a[i])+1);
            }else{
                h.put(a[i],1);
            }
        }
        int k=sc.nextInt();
        ArrayList<Integer> freq=new ArrayList<>();
        for(Integer i:h.keySet()){
            freq.add(h.get(i));
        }
        Collections.sort(freq,Collections.reverseOrder());
        int ans=freq.get(k-1);
        for(Integer i:h.keySet()){
            if(h.get(i)==ans)
                System.out.println(i);
        }
    }
}
