import java.util.Arrays;

public class Strings {
public void StringUpLow() {
	String s="Selenium";
	String lowercase=s.toLowerCase();
//Lowercase
	System.out.println("All to Lowercase:"+lowercase);
//Uppercase
	  String Uppcase=s.toUpperCase();
	  System.out.println("All to Upp Case"+Uppcase);
//Replace works for all characters in the string
	  String replace=s.replace('e', 'c'); 
	  System.out.println("Replace all e's with c"+replace);
//Replace only one character based upon index
	 //Use StringBuilder to modify characters
	  StringBuilder sb=new StringBuilder(s);
	  //Replace 4th character (index=3) with C
	  sb.setCharAt(3, 'C');
	  //Convert back to string
	  String result=sb.toString();
	  System.out.println("Replace only one charcter based on Index"+result);
//Reverse of a string using string builder
	  StringBuilder sbs=new StringBuilder(s);
	  System.out.print("Reversed string using string builder:"+sbs.reverse());
//Find the number of characters in a string
	  int num=s.length();
	  System.out.println("No of characters count:"+num);
	  }
//Reverse of a string using forloop
	  public void ReverseofString() {
      String s="Selenium";
      String rev=" ";
	  for(int i=s.length()-1;i>=0;i--) {
		  rev=rev+s.charAt(i);
		  }
		  System.out.println("Reversed a string using for loop"+rev);  
	  }
//Count Characters with and without spaces
	 public void CCharWithWithoutspaces(){
		 String S="jAVA selenium";
		 System.out.println("With Spaces"+S.length());
		 System.out.println("Without Spaces"+S.replace(" ", "").length());
//Remove white spaces
		 System.out.println(S.replace(" ", "").length());
		 String b="a b c d";
		 System.out.println(b.replace(" ", ""));
		 
	 }
//Count the number of words in a string
	 public void CountnoofWordsinTwoString() {
		 String twos="I love AUtomation";
		 String[] words=twos.trim().split("\\s+");
		 System.out.println("Count words in a String:"+words.length);
		 
	 }
//Count Vowels and Consonants in a string
	 public void CountVowelsConsonants() {
		 String VC="Automation";
		 int Vowels=0,consonants=0;
		 VC=VC.toLowerCase();
		 for(char ch:VC.toCharArray()) {
			 if("aeiou".indexOf(ch)!=-1)
				 Vowels++;
			 else if(ch>='a'&&ch<='z')
				 consonants++;}
		 
			 System.out.println("Vowels:"+Vowels);
			 System.out.println("Consonants"+consonants);
			 }
//Palindrome of a string
	 public String PalindromeOfaString() {
		 
			
			String S="level";
			String rev="";
	        for(int i=S.length()-1;i>=0;i--) {
				rev=rev+S.charAt(i);
			}
	        if(S.equals(rev)) {
	        	System.out.print("Palindrome");}
	        else
	        	System.out.println("not a Palindrome");
			return rev;
			}
	 
//Uppercase to lowercase and low to upp
	 public void UpptoLowLowtoUpp() {
     String s = "SeLeNiUm";
     StringBuilder sb = new StringBuilder();
     for (char ch : s.toCharArray()) {
         if (Character.isUpperCase(ch)) {
             sb.append(Character.toLowerCase(ch));
         } else {
             sb.append(Character.toUpperCase(ch));
         }
     }
     System.out.println(sb.toString());
     }
//Anagram
	 public void Anagram() {
		 String s1 = "listen";
	        String s2 = "silent";

	        char[] a = s1.toCharArray();
	        char[] b = s2.toCharArray();

	        Arrays.sort(a);
	        Arrays.sort(b);

	        if (Arrays.equals(a, b)) {
	            System.out.println("Anagram");
	        } else {
	            System.out.println("Not Anagram");}
		 
	 }
	 // Insert $ inplace of S and reverse the same string
	 public void Infosys() {
		 String I="Infosys";
		String  rev="";
		 StringBuilder sb=new StringBuilder(I);
		 sb.setCharAt(6, '$');
		 String result=sb.toString();
		 String Infosys=result.toString();
		 System.out.println(result);
		 for(int i=result.length()-1;i>=0;i--) {
			 rev=rev+Infosys.charAt(i);
			 
		 }System.out.println(rev);
	 }
	 //Program to count each character
	 static void CharacterCount() {
		    
		        
		        String str = "surendra";
		        str = str.replaceAll("\\s", ""); // removing spaces if any

		        int[] freq = new int[256]; // ASCII size

		        for (char c : str.toCharArray()) {
		            freq[c]++;
		        }

		        for (int i = 0; i < 256; i++) {
		            if (freq[i] > 0) {
		                System.out.println((char)i + " = " + freq[i]);
		            }
		        }
		    }
	 static void Duplicates() {
		    
	        
	        String str = "surendra";
	        str = str.replaceAll("\\s", ""); // removing spaces if any

	        int[] freq = new int[256]; // ASCII size

	        for (char c : str.toCharArray()) {
	            freq[c]++;
	        }

	        for (int i = 0; i < 256; i++) {
	            if (freq[i] >1) {
	                System.out.println((char)i + " = " + freq[i]);
	            }
	        }
	    }

				 
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strings str=new Strings();
		str.StringUpLow();
		str.ReverseofString();
		str.CCharWithWithoutspaces();
		str.CountnoofWordsinTwoString();
		str.CountVowelsConsonants();
		//str.PalindromeOfaString();
		str.UpptoLowLowtoUpp();
		str.Anagram();
		str.Infosys();
		CharacterCount();
		Duplicates();
	}

}
