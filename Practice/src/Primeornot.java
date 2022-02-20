import java.util.Scanner;
public class Primeornot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("It is a Prime Number");
		}
		else
		{
			System.out.println("It is not a Prime Number");
		}
	}

}
