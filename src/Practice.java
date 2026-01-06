
public class Practice {
	  int a=12;
	 String brand="TATA";
	 public static void Sure() {
		 Practice p1=new Practice();
		 System.out.println(p1.brand);
		 if(p1.a%2==0) {
			 System.out.println("Even");
		 }else { System.out.println("Odd");}
		 
	 }
    public void sureb()
    {
    	System.out.println(a);
    	System.out.println(brand);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice p=new Practice();
	p.Sure();
     p.sureb();
	}

}
