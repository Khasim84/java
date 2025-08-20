// performing all array methods
import java.util.Scanner;
import java.util.Arrays;
class ArrayDemo{
	public static void main(String args[]){
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		// scanning array using loop
		for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
		}
		// printing array using loop
		for(int i=0;i<arr.length;i++){
		System.out.print(" "+arr[i]);
		}
		System.out.println(" ");
		
		// sorting method
		Arrays.sort(arr);
		System.out.println("Sorted array="+Arrays.toString(arr));
		
		// binary search method 
		System.out.println("binary search="+Arrays.binarySearch(arr,55));
		
		// Fill method
		Arrays.fill(arr,55);
		System.out.println(Arrays.toString(arr));
		
		// copyOf method
		int[] copiedArray=Arrays.copyOf(arr,5);
		System.out.println(Arrays.toString(copiedArray));
		
		// equals Method
		int[] anotherArray={11,55,33,6,7};
		boolean isEqual=Arrays.equals(arr,anotherArray);
		System.out.println(isEqual);
		
		// to string method
		String arrayString=Arrays.toString(arr);
		System.out.println(arrayString);
		
	}
}
