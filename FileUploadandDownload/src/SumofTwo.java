
public class SumofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,0,1,9,3,7};
		int sum=8;
		for (int i = 0; i < a.length; i++) {
			int first=a[i];
			for (int j = i+1; j < a.length; j++) {
				if(sum==a[i]+a[j])
				{
					System.out.println(a[j]);
					break;
				}
			}
		}
		/*
		for (int i = 0; i < a.length; i++) {
			int diff=sum-a[i];
			if(diff==a[i])
			{
				System.out.println(a[i]);
			}
		}*/
	}

}
