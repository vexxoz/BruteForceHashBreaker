public class StringGen{

	private int length;
	private int startLetter;
	private int endLetter;
	private int[] word;

	public StringGen(){
		length = 1;
		startLetter = 33;
		endLetter = 122;
		word = new String[length];
		for(int i=0;i<length;i++){
			word[i] = startLetter;
		}
	}

	public StringGen(int lenght){
		this.length = length;
		startLetter = 33;
		endLetter = 122;
		word = new String[length];
		for(int i=0;i<length;i++){
			word[i] = startLetter;
		}
	}

	public void generate(){
		// string to put word into
		String printWord = "";

		//while left most word is below ending letter
		while(word[0] <= endLetter){
			// for each letter in array add it to the string
			for(int i=0; i<length;i++){
				printWord = printWord + Character.toString((char)word[i]);
			}
			// print the word
			System.out.println(printWord);
			// clears the string
			printWord = "";

			// increment the right most ascii char
			word[length-1]++;

			// if right most char is above ending ascii letter
			if(word[length-1] > endLetter){
				// go from right to left
				for(int i = length-1;i>0;i--){
					word[i-1]++;
				}
			}

		}
	}

	public void setLength(int length){
		this.length = length;
		word = new String[length];
		for(int i=0;i<length;i++){
			word[i] = startLetter;
		}
	}

	pubic void setStartLetter(int in){
		this.startLetter = in;
	}

	pubic void setEndLetter(int in){
		this.endLetter = in;
	}
}
