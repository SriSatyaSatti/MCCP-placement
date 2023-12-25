// Removing punctuations from a given string

// Given a string, remove the punctuation from the string if the given character is a punctuation character, as classified by the current C locale. The default C locale classifies these characters as punctuation: 
// ! " # $ % & ' ( ) * + , - . / : ; ? @ [ \ ] ^ _ ` { | } ~ 
// Examples: 
// Input : %welcome' to @geeksforgeek<s
// Output : welcome to geeksforgeeks

// Input : Hello!!!, he said ---and went.
// Output : Hello he said and went

import java.util.*;
public class MyClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if((c>='a' && c<='z') || (c>='A' && c<='Z') || (c==' '))
            System.out.print(c);
        }
    }
}
