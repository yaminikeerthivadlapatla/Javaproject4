import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		do {
		int f0=0,f1=1,f2,n0;
		System.out.println("Enter the no of terms in series:");
		int n=s.nextInt();
		System.out.print(f0 + " " + f1 + " ");// 0 1
		 
        for(int i = 3; i <= n; i++)
	{
            f2=f0+f1;
            System.out.print(f2 + " ");
            f0=f1;
            f1 = f2;
	}
        System.out.println();
		}while(true);

		/*System.out.print(n1+ " "+ n2+ " ");
		for(int i=2;i<=n;i++);
		{
		    n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
		System.out.println();
		}*/


}
}