import java.util.Arrays;

public class Arr{
 //Print elements of an array
	public void printArray() {
		int arr[]= {1,6,8,9,7};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		
	}
	public void lengthofArray() {
		int arr[]= {3,8,9,5};
		System.out.println(arr.length);
		
	}
	public void sumofArray() {
		int arr[]= {3,7,9,9};
		int sum=0;
		for(int num:arr) {
			sum+=num;
			System.out.println("sum:"+sum);
		}
	}
	public void FindLargest() {
		int arr[]= {3,9,7,6};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				
			
			max=arr[i];
			System.out.println(max);}}
			
				
			
		}
		public void FindMin() {
			int arr[]= {3,88,99,45};
			
			int min=arr[0];
			for(int i=1;i<arr.length;i++) {
				if(arr[i]<min) {
					min=arr[i];
					
				}
				
			}System.out.println(min);
		}
		public void ReverseanArray() {
			int arr[]= {3,7,9,6};
			for(int i=arr.length-1;i>=0;i--) {
				System.out.println(arr[i]+" ");
			}
			
			}
		public void FindEvenOdd() {
			int arr[]= {3,2,8,6};
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0)
					System.out.println(arr[i]+"Even");
				else { System.out.println(arr[i]+"odd");
					
				}}
			
		}
		public void findDuplicateElements() {
			int arr[]= {3,3,4,5,7,4};
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						System.out.println(arr[i]);
					}}}
						
				
		}
		//Ascending order of an Array
		public void ascendingoaArray() {
			
		
		int[] arr = {5, 2, 8, 1};

		for (int i = 0; i < arr.length; i++) {
		    for (int j = i + 1; j < arr.length; j++) {
		        if (arr[i] > arr[j]) {
		            int temp = arr[i];
		            arr[i] = arr[j];
		            arr[j] = temp;
		        }
		    }
		}
		for (int num : arr) {
		    System.out.println(num + " ");}
		}
		//Common elements between arrays
public void CommonElements() {
	

		int[] a = {1, 2, 3, 4};
		int[] b = {3, 2, 9, 6};

		for (int i = 0; i < a.length; i++) {
		    for (int j = 0; j < b.length; j++) {
		        if (a[i] == b[j]) {
		            System.out.println(a[i]);
		        }
		        
		        }}
		    
		}
   public void SecondLargest() {
	   
        int[] arr = {10, 5, 20, 8};

       Arrays.sort(arr);

        System.out.println("Second Largest: " + arr[arr.length - 2]);
    }



	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Arr array=new Arr();
      array.printArray();
      array.lengthofArray();
      array.sumofArray();
      array.FindLargest();
      array.FindMin();
      array.ReverseanArray();
      array.FindEvenOdd();
      array.findDuplicateElements();
      array.ascendingoaArray();
      array.CommonElements();
      array.SecondLargest();
    
	}

}
