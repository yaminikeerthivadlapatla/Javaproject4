import java.util.*;
public class ArrayBinarySearch19 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		        int arr[]={10,20,30,40,50}; 
		        int arr1[]={10,20,30,40,50};
		        Arrays.sort(arr);
		        System.out.println("Input array:"+Arrays.toString(arr));
		        int key=40;
		        System.out.println("key " + key + "found at index = "+ Arrays.binarySearch(arr,key));
		        System.out.println("Check Equality="+Arrays.equals(arr,arr1));
		        System.out.println("Comparing="+Arrays.compare(arr,arr1));
		    }  
		}  
