package inheritancedemo;
//in mutilevel inheritence super class contains parameterized contructor
class student
{
    String studentname;
    int stdid;
    student(String stdname,int stdid)
    {
        studentname=stdname;
        this.stdid=stdid;
        System.out.println("Student name:"+stdname);
        System.out.println("Student id:"+stdid);
    }
}
class college extends student
{
    college(String studentname,int stdid)
    {
        super(studentname,stdid);
    }
}
class department extends college
{
    department(String studentname,int stdid)
    {
        super(studentname,stdid);
    }
}
public class Assaignment1 {
    public static void main(String[] args) {
        department o=new department("Amith",111);


    }
}
