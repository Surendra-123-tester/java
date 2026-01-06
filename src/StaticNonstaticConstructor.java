//class
public class StaticNonstaticConstructor {
	String brand;
	int speed;
	//Static variable
    static String name="Suredra";
    //Non-static variable
    String name1="Aadvika";
    //Non-Static variable
    private String name2="Surendra";
    //Non-static variable
    public String name3="Hema";
    //Non-static variable
    protected String name5="Ankamma";
    //default String name4="Ravana";//gives compile time error
    //static method
    static void Method() {
    	System.out.println(1);
    	System.out.println("spy");
    }
    //Parameterized constructor-name as same classname, no returntype
    public StaticNonstaticConstructor(String brandq,int speedq) {
    	brand=brandq;
    	speed=speedq;
    	//this.brand=brand;
    	//this.speed=speed;
    }
    public void CarbrandSpeed() {
    	
    	System.out.println(speed+brand);
    	
    }
    //Non-Static method or Instance method
    public void Test1() {
    	System.out.println("Test1");
    }
    //Non-static method
    private void Test2() {
    	System.out.println("Test2");
    }
    //Non-static method
    protected void Test3() {
    	System.out.println("Test3");
    }
    //Constructor
   // public PracticalJava(int a) {
    	
    
    
    
    //Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Static -belongs to class, not to object.no need to create an object
     System.out.println(name);
     //Need to create object for Non-static members-Variables,Methods, class //Parameterized constructor used here
     StaticNonstaticConstructor o=new StaticNonstaticConstructor("Tatoyta",120);
     //Non static members accessed via object
     System.out.println(o.name1);
     System.out.println(o.name2);
     System.out.println(o.name3);
     System.out.println(o.name5);
     //Static methods access classname.method
     StaticNonstaticConstructor.Method();
     
     o.Test1();
     o.Test2();
     o.Test3();
     o.CarbrandSpeed();
	}

}
