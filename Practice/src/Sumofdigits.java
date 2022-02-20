import java.util.*;
public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int sum=0;
			for (int i=1;i<=num;i++)
			{
				sum=sum+i;
			}
				System.out.println("Sum of digits:"+sum);
			}
}