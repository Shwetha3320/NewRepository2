package Absractdemo;
abstract class student
{
    abstract void showname(String name);
    abstract void showid(int id);
}
class college extends student
{
    void showname(String name)
    {
        System.out.println("Student name:"+name);
    }
    void showid(int id)
    {
        System.out.println("Student id:"+id);
    }
}
class university extends college
{
    void showuniversity(String uname)
    {
        System.out.println("University:"+uname);
    }
}
public class Multileveldemo {
    public static void main(String[] args) {
        university o=new university();
        o.showuniversity("VTU");
        o.showname("Saha");
        o.showid(111);
    }
}
