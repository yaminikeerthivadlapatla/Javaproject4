import java.util.Scanner;
public class Prime1to50 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i,t;
		System.out.println("Enter the number:");
		int num=s.nextInt();
		System.out.println("Prime numbers from 1 to 50:");
		for(int j=2;j<=num;j++)
		{
			t=0;
			for(i=1;i<=j;i++)
			{
				if(j%i==0)
					t++;
			}
			if(t==2)
			{
				System.out.print(j+" ");
			}
		}
	}

}
