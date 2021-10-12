package simple;

public class countDigits {
	public static void main(String[] args) {
		int num = 11;
		int c = 0;
		while(num!=0) {
			num = num/10;
			++c;
		}
		 System.out.println(c);
}
}