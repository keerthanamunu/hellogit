
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 2; i <= 100; i++) {
			for(int j=2;j<=i;j++)
			{
				if(j==i)
				{
					System.out.println("prime "+i);
				}
				if(i%j==0)
				{
					break;
				}
			}
		}
	}

}
