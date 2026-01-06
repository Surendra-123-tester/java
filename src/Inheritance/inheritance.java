package Inheritance;

class A {
    public void A5() {
        System.out.println("A");
    }
}

class B extends A {
    public void display() {
        System.out.println("C");
    }
}
class C extends B{
	public void Thirst() {
		System.out.println("D");}
	}


public class inheritance {
    public static void main(String[] args) {
        B b = new B();
        //b.A5();      // Parent class method
        b.display();
        // Child class method
        C c=new C();
        c.Thirst();
        
    }
}
