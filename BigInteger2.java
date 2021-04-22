import java.math.BigInteger;
public class Main
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.err.println("Fact(87)="+factorial(87));

	}
    public static BigInteger factorial(int n) {
    
        BigInteger b1= BigInteger.valueOf(n);
        BigInteger b2 = BigInteger.valueOf(1);
    
        for (long i = 1; i <= n; i++){
            BigInteger i1 = BigInteger.valueOf(i);
            b2 = b2.multiply(i1);
        }
        return b2; 
    }
}