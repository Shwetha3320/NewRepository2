package inheritancedemo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

//Program for multilevel inheritance
class Maths1 {
    void addition(int x, int y)
    {
        int res = x + y;
        System.out.println("addition result" + res);
    }
}
class Maths2 extends  Maths1
{
    void subtraction(int x,int y)
    {
        int res=x-y;
        System.out.println("subtraction result"+res);
    }
}
class Maths3 extends Maths2
{
    void mutiplication(int x,int y)
    {
        int res =x*y;
        System.out.println("mutiplication result="+res);
    }
}
public class Multilevel     {
    public static void main(String[] args)
    {
        Maths3 obj=new Maths3();
        obj.mutiplication(20,10);
        obj.addition(50,50);
        obj.subtraction(200,50);
    }

}
