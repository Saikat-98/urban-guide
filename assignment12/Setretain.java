import java.util.*;
public class Setretain
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the number of elements of first set:");
        int n=ob.nextInt();
        Set<Integer> s=new LinkedHashSet<Integer>();
        while(n>0)
        {
            System.out.print("Enter the element :");
            int x=ob.nextInt();
            s.add(x);
            n--;
        }
        System.out.println("The elements of first set are:");
        for(int n2:s)
            System.out.print(n2+" ");
        System.out.print("Enter the number of elements of second set:");
        int n1=ob.nextInt();
        Set<Integer> s1=new LinkedHashSet<Integer>();
        while(n1>0)
        {
            System.out.print("Enter the element :");
            int x=ob.nextInt();
            s1.add(x);
            n1--;
        }
        System.out.println("The elements of second set are:");        
        for(int n2:s1)
            System.out.print(n2+" ");
        System.out.println("After retaining the elements are:");
        s1.retainAll(s);
        for(int n2:s1)
            System.out.print(n2+" ");
    }
}