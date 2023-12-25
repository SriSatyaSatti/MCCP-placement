// Develop Program to find the initials of a name.

// Given a string name, we have to find the initials of the name 
// Examples: 
// Input  : prabhat kumar singh
// Output : P K S
// We take the first letter of all
// words and print in capital letter.

// Input  : Jude Law
// Output : J L

// Input  : abhishek kumar singh
// Output : A K S

import java.util.*;
public class MyClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toUpperCase();
        String[] words=s.split(" ");
        for(int i=0;i<words.length;i++){
            System.out.print(words[i].charAt(0)+" ");
        }
    }
}
