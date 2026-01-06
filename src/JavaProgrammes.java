import java.util.Arrays;

public class JavaProgrammes {

//Swapping of Two Numbers using third variable
	public void Swap() {
		int a=2;
		int b=3;
		int temp=a;
		a=b;
		b=temp;
		System.out.println(+a);
		System.out.println(+b);
		}
	//Reverse a String
	public String ReverserAString() {
		String s="Surendra";
		String rev="";
		
		for(int N=s.length()-1;N>=0;N--){ 
		rev=rev+s.charAt(N);}
		
		System.out.println(rev);
		return rev;
		
	}
	//Palindrome of a string-Palindrom examples-level, Madam
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
	//Count Vowels&Consonants in the String toCharArry() -Converts the string into a Character array and indexOf(C)-Searches for the charecter in aeiou.
	public int CountVowels() {
		String s="AadvikaSurendra";
		int Vowels=0,Consonants=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				Vowels++;
				
		}else if(ch>='a'&& ch<='z') {}
			Consonants++;
			}{
		System.out.println(Vowels);
		System.out.println(Consonants);
		return Vowels;
		
			}}
	
	//Charecter Occurences
	public void CharOccur() {
		String str="Surendra";
		char ch='e';
		int count=0;
		for(char c:str.toCharArray()) {
			if(c==ch)
				count++;
		}
		System.out.println(count);
	}
	//Reverse an Integer
	public void ReverseanInteger() {
		int num=12345;
		int rev =0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println(rev);
	}
	//FindLar and Smallest in an array
	public void FindLarSmallest() {
		int []arr= {10,12,234,456};
		int max=arr[0];
		int min=arr[0];
		for(int n:arr) {
			if(n>max) {
				max=n;
			}
			if(n<min) {
				min=n;
			}
			
		}
		
		System.out.println(max);
		System.out.println(min);
	}
	//Primenumber check
	public void PrimeNumberCheck() {
		int num=45;
		boolean flag = true;
		for(int i=2;i<num/2;i++) {
			if(num %i==0) {
				flag=false;
				break;
			}}
		System.out.println(flag );
			
		
	}
	//Find the largest of three numbers
	public void findLarthreenum() {
		int a=10,b=16,c=9;
		int Largest=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println(Largest);
		
	}
	//Find Second largest num in an Array
	public void FindSecLarNum() {
		int arr[]= {1,4,79,89,777};
	    Arrays.sort(arr);
	    System.out.println(arr[arr.length-2]);
		
	}
	//Find Sum of digits
	public void SumOfdigits() {
		int num=2345464;
		int sum=0;
		while(num!=0) {
			sum+=num%10;
			num/=10;}
		System.out.println(sum);
		}
	//Sort an Array
	public void SortanArray() {
		int[]arr= {1,8,0,4,56};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	//Count words in a string
	//Swapping of Two Numbers without using third variable
	public static void main(String[] args) {
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
	 System.out.println(+a );
	 System.out.println(+b);
	 JavaProgrammes java=new JavaProgrammes();
	 java.Swap();
	 java.ReverserAString();
	 java.PalindromeOfaString();
	 java.CountVowels();
	 java.CharOccur();
	 java.ReverseanInteger();
	 java.FindLarSmallest();
	 java.PrimeNumberCheck();
	 java.findLarthreenum();
	 java.FindSecLarNum();
	 java.SumOfdigits();
	 java.SortanArray();
		
	
	}
	
}
