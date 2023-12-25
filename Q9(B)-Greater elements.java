// The Leaders
// Print all those elements that have no element greater than them in the right side of the array. Print elements from right to left.

// Test Case 1:
// Input : A[] = [1, 2, 3, 4, 5]
// Output : 5
// Explanation : Only 5 has no element greater than it on its right.
// Test Case 2:
// Input : A[] = [1, 4, 3, 2]
// Output : 2 3 4 
// Explanation : 2, 3, and 4 have no elements greater than them on their right while 1 has 4, 3 and 2 greater than it on its right.

import java.util.*;
public class MyClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        TreeSet<Integer> t=new TreeSet<>();
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    t.add(a[j]);
                }
            }
        }
        t.add(a[n-1]);
        for(Integer i:t){
            System.out.print(i+" ");
        }
    }
}
