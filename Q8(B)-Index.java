// Given marks of N students sitting on a bench and a value of K, print the index of the student whose marks matches with the value of K.
// Input : N = 10, K = 67
//  A[] = [60, 61, 62, 63, 63, 64, 65, 66, 67, 66]
// Output : 8
// Explanation : 67 is present at 8th index (0-based indexing)

import java.util.*;
public class MyClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        int k=sc.nextInt();
        System.out.println(a.indexOf(k)+1);
    }
}
