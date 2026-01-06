package prac;
interface a
{
	abstract void tiru();
}
class b implements a
{
	public void tiru()
	{
		System.out.println("duy");
	}
}
public class intro {
	public static void main(String[] args) {
		b s=new b();
		s.tiru();
	}


}
