package Absractdemo;
abstract class insta1
{
    {
        System.out.println("this is instance block alone");
    }

}
class insta2 extends insta1
{
    void showname(String name)
    {
        System.out.println("Name:"+name);
    }
    void showage(int age)
    {
        System.out.println("Age:"+age);
    }
}
public class Instanceblockalone {
    public static void main(String[] args) {
        insta2 o=new insta2();
        o.showname("Arun");
        o.showage(20);
    }
}
