package inheritancedemo;
class collegename
{
    void showname(String name)
    {
        System.out.println("College name:"+name);
    }
}
class dept1 extends collegename
{
    void showdept1(String dept1)
    {
        System.out.println("First department is:"+dept1);
    }
}
class dept2 extends collegename
{
    void showdept2(String dept2)
    {
        System.out.println("Second department is:"+dept2);
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        dept2 o=new dept2();
        o.showname("VTU");
        o.showdept2("Computer Science");
        dept1 o2=new dept1();
        o2.showdept1("Information Science");
        o2.showname("KSIT");
    }
}
