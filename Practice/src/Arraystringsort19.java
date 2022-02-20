import java.util.*;
public class Arraystringsort19 {

	public static void main(String[] args) {
	       /*String[] srt= {"Yamini","Mike","Munni","Maitrai"};
	       arrays.sort(srt);
	       System.out.println(arrays.toString(srt));*/
		int[] arrayInt = new int[5];
	      arrayInt[0] = 12;
	      arrayInt[1] = 30;
	      arrayInt[2] = 6;
	      arrayInt[3] = 25;
	      arrayInt[4] = 33;
	      for(int i = 0; i < arrayInt.length; i ++ ) {
	         System.out.print(", " + arrayInt[i]);
	      }
	      Arrays.sort(arrayInt); // This line sorts our array.
	      System.out.println();
	      for(int i = 0; i < arrayInt.length; i ++ ) {
	         System.out.print(", " + arrayInt[i]);
	      }


	}

}
