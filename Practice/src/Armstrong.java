import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		int c=0,a,b;
		a=num;
		while(a>0)
		{
			b=a%10;
			c=c+(b*b*b);
			a=a/10;
		}
		if(num==c)
		{
			System.out.println("It is an Armstrong Number");
		}
		else
		{
			System.out.println("It is not an Armstrong Number");
		}

	}

}
