
public class Practicejava {
    int a=12;
    
    int b=12;
   static int d=1;
    
    public static void d() {
    	System.out.println(d);
    	Practicejava p3=new Practicejava();
    	
    	System.out.println(p3.b);
    	
    }
    private void e() {
    	System.out.println(a);
    	System.out.println(d);
    }
    protected static void Sum() {
    	Practicejava p1=new Practicejava();
    	
    	int c =p1.a+p1.b +d;
    	System.out.println(c);
    
    }
    public void Sum1(){
    	int c=b-a+d;
    	System.out.println(c);
    	
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Sum();
     Practicejava p2= new Practicejava();
     
     p2.Sum1();
     d();
     p2.e();
	}

}
