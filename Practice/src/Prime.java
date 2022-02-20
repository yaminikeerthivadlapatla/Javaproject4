
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
        // while loop 
        while(num<11){
            // condition for continue
            if (num%3==0){
                num++;
                continue;
            }
            // printing number
            System.out.println("counting...."+num);
            // incrementing the num
            num++;
        }


	}

}
