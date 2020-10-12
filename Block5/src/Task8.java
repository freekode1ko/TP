import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
import java.math.BigInteger;

public class Task8
{
	public static void main(String[] args) throws Throwable 
	{
		System.out.println(getSha256Hash("password123"));
	}
	public static String getSha256Hash(String Pass) throws NoSuchAlgorithmException 
	{
	    MessageDigest md = MessageDigest.getInstance("SHA-256");

	    // Change this to UTF-16 if needed
	    md.update(Pass.getBytes(StandardCharsets.UTF_8));
	    byte[] digest = md.digest();

	    String hex = String.format("%064x", new BigInteger(1, digest));
		return hex;
	 }
}