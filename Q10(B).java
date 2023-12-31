// B)	Given an array A of N elements, your task is to print all those indexes that have values greater than its left and right neighbors. In case of extreme indexes like 0 and N-1, check with their single neighbor.
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      if(a[0]>a[1])
      System.out.println(0);
      for(int i=1;i<n-1;i++){
          if(a[i]>a[i-1] && a[i]>a[i+1])
          System.out.println(i);
      }
      if(a[n-1]>a[n-2])
      System.out.println(n-1);
    }
}
