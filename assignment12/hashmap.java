import java.util.*;
class Student
{
    String name,course;
    int rollno;
    Student()
    {
        rollno=0;
        name="";
        course="";
    }
    Student(int roll,String n,String c)
    {
        rollno=roll;
        name=n;
        course=c;
    }
    public boolean equals(Object o)
    {
        Student s=(Student)o;
        if(this.rollno==s.rollno)
            return true;
        else
            return false;
    }
    public int hashCode()
    {
        return this.rollno;
    }
}
class hashmap
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the number of elements in map:");
        int n = ob.nextInt();
        Map<Integer,Student> m = new LinkedHashMap<Integer,Student>();
        Student[] ob1=new Student[n];
        int i,j;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the rollno:");
            int x= ob.nextInt();
            String n1= ob.nextLine();
            System.out.print("Enter the name:");
            n1= ob.nextLine();
            System.out.print("Enter the course:");
            String c= ob.nextLine();
            ob1[i]=new Student(x,n1,c);
        }
        for(i=0,j=0;i<n;i++)
        {
            System.out.print("Enter the id:");
            int k = ob.nextInt();
            m.put(k,ob1[i]);
        }
        Set s=m.entrySet();
        Iterator it=s.iterator();
        for(i=0;it.hasNext();i++)
        {
            Map.Entry me=(Map.Entry)it.next();
            int k=(int)me.getKey();
            System.out.print("The Id is =>"+k+" ");
            Student ob2=(Student)me.getValue();
            System.out.print("The Name is =>"+ob1[i].name+" ");
            System.out.println("The Course is =>"+ob1[i].course);
        }
    }
}