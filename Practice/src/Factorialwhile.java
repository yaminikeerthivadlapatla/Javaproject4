import java.util.*;  
public class Factorialwhile{
	public static void main(String[] args){
		int fact=1,n=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		while(n<=num )
		{
			fact=fact*n;
			n++;
			}
		System.out.println("Factorial of " + num + " is: " + fact);  
	    }  
	}  
