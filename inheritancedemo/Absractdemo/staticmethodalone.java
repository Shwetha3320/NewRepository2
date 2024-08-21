package Absractdemo;
abstract class staticdemo1
{
    static void showphno(int no)
    {
        System.out.println("ph no:"+no);
    }
}
public class staticmethodalone {
    public static void main(String[] args) {
        staticdemo1.showphno(1234567890);
    }
}
