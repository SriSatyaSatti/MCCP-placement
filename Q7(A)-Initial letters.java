// A) Program to print the initials of a name with the surname

// Given a full name in the form of a string, the task is to print the initials of a name, in short, and surname in full. 
// Examples:
// Input: Devashish Kumar Gupta
// Output: D. K. Gupta

// Input: Ishita Bhuiya
// Output: I. Bhuiya

import java.util.*;
public class MyClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toUpperCase();
        String[] words=s.split(" ");
        for(int i=0;i<words.length-1;i++){
            System.out.print(words[i].charAt(0)+". ");
        }
        System.out.print(words[words.length-1]);
    }
}
