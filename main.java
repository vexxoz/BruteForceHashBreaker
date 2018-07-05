import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class main {

	public static String[] wordList = {"dog", "cat", "bunny", "mouse"};
	
	public static void main(String[] args) throws NoSuchAlgorithmException, FileNotFoundException, IOException {
		
		// User interface
		System.out.println("Type in Hash");
		Scanner input = new Scanner(System.in);
		String hash = input.nextLine();
		
		// Constructors
		MD5 MDFive = new MD5(hash);
		
		// Variables for printout
		String MD5Word = "";
		
		// Looping for each word
		try (BufferedReader br = new BufferedReader(new FileReader("words.txt"))) {
			
		    String line;
		    while ((line = br.readLine()) != null) {
				if(MD5Word.isEmpty() && MDFive.decode(line)) {
					MD5Word = line;
					
				}
		    }
			
			// Display
			System.out.println("MD5: " + MD5Word);
			
			
		}catch(Exception IOException) {
			System.out.println("Word File Cannot be Found");
		}

		
	}

}
