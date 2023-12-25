// Program to print reverse character bridge pattern
/* For a given value N, denoting the number of Charters starting from the A, print reverse character bridge pattern. Examples :   */
// Input : n = 5
// Output :
//  ABCDEDCBA
//  ABCD DCBA
//  ABC   CBA
//  AB     BA
//  A       A
// Input : n = 8
// Output :
// ABCDEFGHGFEDCBA
// ABCDEFG GFEDCBA
// ABCDEF   FEDCBA
// ABCDE     EDCBA
// ABCD       DCBA
// ABC         CBA
// AB           BA
// A             A

import java.util.*;
public class MyClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print((char)(c+65));
                c++;
            }
            for(int j=0;j<2*i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<n;j++){
                c--;
                System.out.print((char)(c+65));
            }
            System.out.println();
        }
    }
}
