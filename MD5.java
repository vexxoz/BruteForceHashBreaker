import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class MD5 {
	String hash;
	
	/**
	 * Constructor
	 * @param hashIn the hash to be broken
	 */
	public MD5(String hashIn) {
		hash = hashIn;
	}
	
	/**
	 * Gets the input and turns it into a hash to be checked with the hash to be broken
	 * @param word word to be hashed and checked
	 * @return if the hashed input word mathches the hash boolean
	 * @throws NoSuchAlgorithmException
	 */
	public boolean decode(String word) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		String myHash = DatatypeConverter.printHexBinary(md.digest(word.getBytes()));
		
		
		if(hash.equalsIgnoreCase(myHash)) {
			return true;
		}
		return false;
	}
}
