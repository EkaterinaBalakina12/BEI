import java.math.BigInteger;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.err.println("Fact(87)="+factorial(87));
	}
	public static BigInteger factorial(int n) {
		if (n <= 1) {
			return  BigInteger.valueOf(1);
		}
		else {
			return BigInteger.valueOf(n).multiply(factorial(n-1));
		}
	}
}
