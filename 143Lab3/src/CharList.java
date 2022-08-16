

public class CharList {

	private char[] arr = new char[100];
	private int charCount;

	public CharList(){
		
	}

	public CharList(String untouchedString){
		arr = untouchedString.toCharArray();
	}

	public CharList(CharList other){
		if(other == null) {
			System.out.print("Error. CharList cannot be null.");
		} else { 
			arr = other.arr;
			charCount = other.charCount;	
		}
	}
 
	public void add(char next){
		arr[charCount++] = next;
	}

	public int size(){
		return charCount;
	}

	public char get(int index){
		char charAtIndex = ' ';
		for(int i=0;i<=index;i++){
			charAtIndex = arr[index];
		}
		return charAtIndex;
	}

	public char[] getChars(){
		return arr;
	}

	@Override
	public String toString(){
		String retVal = " ";

		for(int i=0;i<arr.length;i++){
			retVal += arr[i];
		}
		return retVal;
	}

	public boolean equals(Object other) {
		if(other != null && this.size() == ((CharList)other).size() 
				&& this.getChars() == ((CharList)other).getChars()){
			return true;
		}else{
			return false;
		}
	}
}