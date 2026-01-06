package prac;

abstract class ggg
{
	abstract void tiru();
}
class c extends ggg
{
	public void tiru()
	{
		System.out.println("errrt");
	}
}
public class gg
{
	public static void main(String[] args) {
		c s=new c();
		s.tiru();
	}
}