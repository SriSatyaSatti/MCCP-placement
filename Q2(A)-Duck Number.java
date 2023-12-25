// Q2)
// Check Whether a number is Duck Number or not

// A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers. Please note that a numbers with only leading 0s is not considered as Duck Number. For example, numbers like 035 or 0012 are not considered as Duck Numbers. A number like 01203 is considered as Duck because there is a non-leading 0 present in it.
// Examples :
/* Input : 707069  Output : It is a duck number.  Explanation: 707069 does not contains zeros at the beginning.
// Input : 02364  Output : It is not a duck number.  Explanation: in 02364 there is a zero at the beginning of the number.*/

import java.util.*;
public class MyClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.charAt(0)=='0'){
            System.out.print("It is not a duck number");
            return;
        }
        System.out.println("It is a duck number");
    }
}
