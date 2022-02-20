import java.util.*;
public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reverse=0,num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		while(num!=0)
		{
			int rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		System.out.println("Reverse number:"+reverse);
	}

}
