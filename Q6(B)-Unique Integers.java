// B)  Given an array A with N integers, find the count of unique integers in the array.

// Input : arr = [3 2 4 1 2 3]
// Output : 2
// Explanation: only 1 and 4 are unique in the array rest 2, 3 are occurring 2 times.

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
        int c=0;
        for(Integer i:h.keySet()){
            if(h.get(i)==1)
                c++;
        }
        System.out.print(c);
    }
}
