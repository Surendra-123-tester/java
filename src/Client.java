
public class Client {
       
	public void rev(String s) {
		
	
	//String s="Aadvika";
	String rev ="  ";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	}
	
	public void occurences() {
		String sure="122234";
		int[] freq=new int[256];
		for (char c : sure.toCharArray()) {
	            freq[c]++;
	        }
		
         for(int i=0;i<256;i++) {
        	 if(freq[i] > 1){
        System.out.println((char)i+" "+freq[i]);
        	 }
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Client rev=new Client();
      rev.occurences();
      rev.rev("Aadvika");
	}}


