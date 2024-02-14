package Inheritance;

class A{
    public void a(){
        System.out.println("This is the A class");
    }
}
class B extends A{
    public void b(){
        System.out.println("This is the B class");
    }
}
class C extends B{
    public void c(){
        System.out.println("This is the C class");
    }
}

public class SimpleAndMultilevel {
    public static void main(String[]args){
        System.out.println("Main Method");
        C obj=new C();
        obj.c();
        obj.b();
        obj.a();
    }
    
}
