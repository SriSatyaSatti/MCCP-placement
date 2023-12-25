// B)  Identical Twins
// For an array of integers nums, an identical twin is defined as pair (i, j) where nums[i] is equal to nums[j] and i < j.
// Test Case 1: Array: [1, 2, 3, 2, 1]
// Number of Identical Twins: 2
// Explanation:
// Identical Twins: [[1, 1], [2, 2]]
// Indexes: (0, 4), (1, 3)
// Test Case 2: Array: [1, 2, 2, 3, 2, 1]
// Number of Identical Twins: 4
// Explanation:
// Identical Twins: [[1, 1], [2, 2], [2, 2], [2, 2]]
// Indexes: (0, 5), (1, 2), (1, 4), (2, 4)
// Test Case 3: Array: [1, 1, 1, 1]
// Number of Identical Twins: 6
// Explanation:
// Identical Twins: [[1, 1], [1, 1], [1, 1], [1, 1], [1, 1], [1, 1]]
// Indexes: (0, 1), (0, 2), (0, 3), (1, 2), (1, 3), (2, 3)

// Given an array nums, find the number of identical twins.

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j])
                c++;
            }
        }
        System.out.println(c);
    }
}
