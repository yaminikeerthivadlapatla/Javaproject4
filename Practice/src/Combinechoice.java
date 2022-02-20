import java.util.*;
public class Combinechoice {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			do {
				System.out.println("Enter your choice:");
				int a=s.nextInt();
				System.out.println("1.Sum of digits:");
				System.out.println("2.Factorial:");
				System.out.println("3.Fibanocci series:");
				int num=s.nextInt();
				switch(num)
				{
				case 1:
					int sum=0;
					for(int i=1;i<=a;i++)
					{
						sum+=i;
					}
					System.out.println("Sum of digits:"+sum);
					break;
				case 2:
					int fact=1;
					for(int i=1;i<=a;i++)
					{
						fact=fact*i;
					}
					System.out.println("fact is: " + fact);
					break;
				case 3:
					int n1=0,n2=1,n3;
					System.out.print(n1 + " " + n2 + " ");
					for(int i = 3; i <= a; i++)
					{
				            n3=n1+n2;
				            System.out.print(n3 + " ");
				            n1=n2;
				            n2=n3;
				     }
					break;
				default:
					System.out.println("Invalid");
				}
			}
			while(true);

	}
		}
