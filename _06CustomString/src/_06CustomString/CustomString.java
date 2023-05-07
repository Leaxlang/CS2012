package _06CustomString;

public final class CustomString{
	private char[] data;

	//constructor
	public CustomString(char[] data) {
		this.data = data;
	}


	//public CustomString changeCase(): Returns a new CustomString where the case of each letter is changed to the opposite. Upper becomes lower, and lower becomes upper.
	public CustomString changeCase() {
		char[] changedCase = data.clone(); 
		for(int c = 0; c < changedCase.length; c++) {
			if(changedCase[c] >= 'a' && changedCase[c] <= 'z') {
				changedCase[c] -= 32;
			}else if(changedCase[c] >= 'A' && changedCase[c] <= 'Z'){
				changedCase[c] += 32;
			}else {
				continue;
			}
		}
		return new CustomString(changedCase);
	}

	//public char charAt(int index): Return the character at the given
	public char charAt(int index) {
		return data[index];
	}

	//public int compareTo(CustomString rhs): Compares two CustomStrings lexicographically. Returns 0 if the two CustomString objects are the same, returns a positive data if the left hand CustomString is greater than the right hand CustomString. Returns a negative data of the left hand CustomString is less than the right hand CustomString. NOTE: Can ignore case.
	public int compareTo(CustomString rhs) {
		if(data.length == rhs.length()) {
			return 0;
		}else if(data.length < rhs.length()) {
			return -1;
		}else {
			return 1;
		}
	}

	//public CustomString concat(CustomString rhs): Returns a new CustomString object created by concatenating the source string and the parameter string.
	public CustomString concat(CustomString rhs) {
		int lengthA = data.length;
		int lengthB = rhs.length();

		char [] result = new char[lengthA + lengthB];

		for(int i =0; i < lengthA; i++) {
			result[i] = data[i];
		}
		for(int j = 0; j <  lengthB; j++ ) {
			result[j + lengthA] = rhs.data[j];
		}
		return new CustomString(result);
	}

	//public boolean equals(CustomString rhs): Returns true or false based on whether or not the two strings are equal. NOTE: ?Can? ignore case.
	public boolean equals(CustomString rhs) {
		if(data.length != rhs.length()) {
			return false;
		}
		else {
			for(int i = 0; i < data.length; i++) {
				if(data[i]!=rhs.data[i]) {
					return false;
				}
			}
		}
		return true;
	}


	//public int length(): Returns the length of the CustomString
	public int length() {
		return data.length;
	}


	//public CustomString substring(int srcBegin): Returns a new CustomString object created by finding the substring of the source string starting with srcBegin and going to the end of the source string.
	public CustomString substring(int srcBegin) {

		if(srcBegin > data.length) {
			//throw Error
		}
		int arrayLength = data.length - srcBegin;
		char[] result = new char[arrayLength];
		for(int i = 0; i < arrayLength; i ++) {
			result[i] = data[i + srcBegin];
		}
		return new CustomString(result);
	}


	//public CustomString substring(int srcBegin, int srcEnd): Returns a new CustomString object created by finding the substring of the source starting with srcBegin and ending at srcEnd – 1.
	public CustomString substring(int srcBegin, int srcEnd) {

		if(srcBegin > data.length||srcEnd > data.length) {
			System.out.println("The beginning index can not be after the end.");
		}

		char[] result = new char[srcEnd - srcBegin];

		for(int i = 0; i < srcEnd - srcBegin; i ++) {
			result[i] = data[i + srcBegin];
		}
		return new CustomString(result);
	}


	//public CustomString[] split(char delimiter): Returns a CustomString array, where each element of the array is a CustomString object created by splitting the source string based on the given char This is an easier version of the split method provided in the String class and you only need to split on one character. The output array should NOT contain the delimiter character.
	public CustomString[] split(char delimiter){
		CustomString[] result = new CustomString[2];
		int counter = 0;

		for(int i = 0; i < data.length; i++) {
			if(delimiter == data[i]) {
				result[0] = substring(0, i);
				result[1] = substring(i);
			}
			else if(counter+1 == data.length) {
				System.out.println("There is no such character in you Custom String!");
			}
			else {
				counter++;
			}
		}
		return result;
	}

	//public CustomString titleize(): Returns a new CustomString object where the first character of every word is capitalized.
	public CustomString titleize() {


		char[] changedCase = data.clone();

		for(int c = 0; c < changedCase.length; c++) {
			if(changedCase[c] >= 'A' && changedCase[c] <= 'Z'){
				changedCase[c] += 32;
			}
			else {
				continue;
			}

			for(int i = 0; i < changedCase.length - 1; i++) {
				if(changedCase[i]==' ' && (changedCase[i+1] >= 'a' && changedCase[i+1] <= 'z')) {
					changedCase[i+1] -= 32;
				}
			}
			if(changedCase[0]>= 'a' && changedCase[0] <= 'z') {
				changedCase[0] -=32;
			}
		}
		return new CustomString(changedCase);

	}

	//public CustomString toLowerCase(): Returns a new CustomString object with all lower case letters.
	public CustomString toLowerCase() {
		char[] changedCase = data.clone(); 
		for(int c = 0; c < changedCase.length; c++) {
			if(changedCase[c] >= 'A' && changedCase[c] <= 'Z'){
				changedCase[c] += 32;
			}
			else {
				continue;
			}
		}
		return new CustomString(changedCase);
	}

	//public CustomString toUpperCase(): Returns a new CustomString object with all upper case letters.
	public CustomString toUpperCase() {
		char[] changedCase = data.clone(); 
		for(int c = 0; c < changedCase.length; c++) {
			if(changedCase[c] >= 'a' && changedCase[c] <= 'z') {
				changedCase[c] -= 32;
			}
			else {
				continue;
			}
		}
		return new CustomString(changedCase);
	}

	//public String toString()
	public String toString() {
		return String.valueOf(data);
	}


	public void setData(char[] newData) {
		this.data = newData;
	}
	public char[] getData(){
		return this.data;
	}
}


// -- Constructor --
//
//    public CustomString(char[] data): Constructor which creates a CustomString object from the given char array.

//String, StringBuilder, or Wrapper classes. (This also includes using String literals in your CustomString class


// --- Methods --
//
//    public CustomString changeCase(): Returns a new CustomString where the case of each letter is changed to the opposite. Upper becomes lower, and lower becomes upper.
//    public char charAt(int index): Return the character at the given
//    public int compareTo(CustomString rhs): Compares two CustomStrings lexicographically. Returns 0 if the two CustomString objects are the same, returns a positive data if the left hand CustomString is greater than the right hand CustomString. Returns a negative data of the left hand CustomString is less than the right hand CustomString. NOTE: Can ignore case.
//    public CustomString concat(CustomString rhs): Returns a new CustomString object created by concatenating the source string and the parameter string.
//    public boolean equals(CustomString rhs): Returns true or false based on whether or not the two strings are equal. NOTE: Can ignore case.
//    public int length(): Returns the length of the CustomString
//    public CustomString[] split(char delimiter): Returns a CustomString array, where each element of the array is a CustomString object created by splitting the source string based on the given char This is an easier version of the split method provided in the String class and you only need to split on one character. The output array should NOT contain the delimiter character.
//    public CustomString substring(int srcBegin): Returns a new CustomString object created by finding the substring of the source string starting with srcBegin and going to the end of the source string.
//    public CustomString substring(int srcBegin, int srcEnd): Returns a new CustomString object created by finding the substring of the source starting with srcBegin and ending at srcEnd – 1.
//    public CustomString titleize(): Returns a new CustomString object where the first character of every word is capitalized.
//    public CustomString toLowerCase(): Returns a new CustomString object with all lower case letters.
//    public CustomString toUpperCase(): Returns a new CustomString object with all upper case letters.
//    public String toString(): Returns a String representation of the CustomString This is the only place where you are allowed to use a String variable to build the output string and return it.
