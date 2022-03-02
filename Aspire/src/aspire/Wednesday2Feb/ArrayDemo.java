package aspire.Wednesday2Feb;

//SINGLE DIMENSIONAL ARRAY
public class ArrayDemo {
	public static void main(String[] args) {
		int []arr= {12,34,2,34,45};//direct initialization of an array
		
		System.out.println("Length of Array:  " + arr.length);
		
		System.out.println("First value of array:  " + arr[0]);//first value
		
		System.out.println("Fifth value of array:  " + arr[4]);
		
		System.out.println("Last value of array using length-1:  " + arr[arr.length-1]);
		
		//System.out.println(arr[5]);//throws ArrayIndexOutOfBoundsException
		
		System.out.println("All 4 values of Array: ");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		arr[0]=3000;
		arr[1]=4000;
		
		System.out.println("After values got changed Array is: ");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		//we are now going to declare an empty array
		int arr2[]=new int[3];// by default zero will be assigned
		//the number in the right side indicates the number of columns
		
		System.out.println("New Empty Array: ");
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		arr2[0]=3000000;
		arr2[1]=4000000;
		
		System.out.println("Values intialized in array 0 and 1:  ");
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
	}
}
