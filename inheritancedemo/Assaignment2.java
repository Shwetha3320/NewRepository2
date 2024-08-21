package inheritancedemo;
//in hybrid inheritance super class contain parametarized constuctor
class student1
{
    String studentname;
    int stdid;
    student1(String stdname,int stdid)
    {
        studentname=stdname;
        this.stdid=stdid;
        System.out.println("Student name:"+stdname);
        System.out.println("Student id:"+stdid);
    }
}
class college1 extends student1
{
    college1(String studentname,int stdid)
    {
        super(studentname,stdid);
    }
}
class department1 extends college1
{
    department1(String studentname,int stdid)
    {
        super(studentname,stdid);
    }
}
class university extends student1
{
    university(String studentname,int stdid)
    {
        super(studentname,stdid);
    }
}
public class Assaignment2 {
    public static void main(String[] args) {
        university o = new university("Arun", 110);
        department1 o2 = new department1("Asha", 112);
    }
}
