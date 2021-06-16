import java.util.*;

import javax.print.event.PrintJobListener;

class student
{
    String name, roll;
    double marks, attendance;

    student(String n, String r, double mark, double attend)
    {
        name = n;
        roll = r;
        marks = mark;
        attendance = attend;
    }

    void set()
    {
        marks =0.0;
        attendance = 0.0;
    }
    void get()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, roll, marks and attendance");
        name=sc.next();
        roll=sc.next() ;
        marks=sc.nextDouble();
        attendance = sc.nextDouble();
    }
    double studentTest()
    {
        if(attendance>75)
        return (marks*1.1);
        else
        return marks;
    }


    public static void main(String[] args)
    {
        student obj = new student("abc", "xyz", 0.0, 0.0);
        student obj1 = new student("abc", "xyz", 0.0, 0.0);
        obj.set();
        obj.get();
        obj.marks= obj.studentTest();
        if(obj.marks>100)
        obj.marks=100;

        System.out.println(obj.name+ " "+ obj.roll + " "+ obj.marks+ " "+obj.attendance);
        obj1.set();
        obj1.get();
        obj1.marks=obj1.studentTest();
        if(obj1.marks>100)
        obj1.marks=100;
        System.out.println(obj1.name+ " "+ obj1.roll + " "+ obj1.marks+ " "+obj1.attendance);

        
    }
}