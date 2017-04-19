
public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S="helloo";
		char[] sarray=S.toCharArray();
		System.out.println(sarray.length);
		String temp = "";
		for (int i = sarray.length-1; i >=0; i--) {
			System.out.println(sarray[i]);
			temp=temp+sarray[i];
		}
		System.out.println(temp);
	}

}
