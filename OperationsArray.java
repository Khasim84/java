// performing all operations on array
 import java.util.Arrays;
 class OperationsArray{
 	public static void main(String args[]){
 		int[] arr={1,4,5,6,7};
 		int[] newArr=new int[arr.length];
 		// copying array to new array
 		for(int i=0;i<arr.length;i++){
 			newArr[i]=arr[i];
 		}
 		System.out.println("new array="+Arrays.toString(newArr));
 		
 		// Assigning array to refrence array
 		int[] a={1,2,3,4,5};
 		int[] newA=a;
 		newA[0]=10;
 		System.out.println("original array="+Arrays.toString(a));
 		System.out.println("refrence array="+Arrays.toString(newA));
 		
 		// copying arrays using loops without changing the original array
 		int[] b={1,2,3,4,5};
 		int[] newB=new int[b.length];
 		for(int i=0;i<b.length;i++){
 			newB[i]=b[i];
 		}
 		newB[0]=10;
 		System.out.println("orignal array="+Arrays.toString(b));
 		System.out.println("new array by changing values="+Arrays.toString(newB));
 		
 		// using Arrays.copyOf
 		int[] array={2,4,6,8,9};
 		int[] newArray=Arrays.copyOf(array,array.length);
 		newArray[0]=10;
 		newArray[1]=1000;
 		System.out.println("new array using copyOf="+Arrays.toString(newArray));
 		
 		// using arraycopy
 		int[] originalArray={1,3,5,7,9};
 		int[] newArrayy=new int[originalArray.length];
 		System.arraycopy(originalArray,0,newArrayy,0,originalArray.length);
 		newArrayy[4]=10000;
 		System.out.println("using array copy="+Arrays.toString(originalArray));
 		System.out.println("using array copy="+Arrays.toString(newArrayy));
 		
 		//using clone
 		int[] c={22,44,66,88,3};
 		int[] d=c.clone();
 		d[0]=3;
 		System.out.println("array using clone="+Arrays.toString(c));
 		System.out.println("array using clone="+Arrays.toString(d));
 		
 		 		
 	}
 }
