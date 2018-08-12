import java.util.ArrayList;

/*
 When you need an array-like data structure that offers dynamic resizing, you would usually use an ArrayList.
An ArrayList is an array that resizes itself as needed while still providing O( 1) access. A typical implementation
is that when the array is full, the array doubles in size. Each doubling takes 0 (n) time, but happens so
rarely that its amortized insertion time is still 0 (1).
 */
public class ArrayFunctionality {
	
	public ArrayList<String> mergeArrays (String[] str1, String[] str2){//complexity: O(N)
		ArrayList<String> list = new ArrayList<String>();
		for (String s : str1) {
			list.add(s);
		}
		for (String s : str2) {
			list.add(s);
		}
		return list;
	}
	
	public String concatString (String[] words) {//complexity: O(N^2), because the new string has to be appended
		String sentance = "";
		for(String s : words) {
			sentance += s;
		}
		return sentance;
	}
	
	public StringBuilder concatStringBuilder (String[] words) {//complexity: O(N), StringBuilder will use resizable array
		StringBuilder sentance = new StringBuilder();
		for(String s : words) {
			sentance.append(s);
		}
		return sentance;
	}
	//Implement an algorithm to determine if a string has all unique characters
	public Boolean isUnique (String input) {
		/*Sol 1: number of unique ASCCI chars is assumed to be 128, if string greater then is not unique, otherwise
		go through the string, if the int value of the char is not available in a boolean array[128] that you created
		then added it, otherwise return false
	
		Sol 2: If we are allowed to modify the input string, we could sort the string in O( n log( n)) time and then
		linearly check the string for neighboring characters that are identical. Careful, though: many sorting
		algorithms take up extra space.*/
		
		if (input.length()>128)
			return false;
		boolean[] checker = new boolean[128];
		for(int i=0;i<input.length();i++) {
			int val = input.charAt(i);
			if(checker[val])
				return false;
			checker[val]=true;
		}
		return true;
	}
	
	public boolean isPermutation(String str1, String str2) {
		/*
		 to find if 2 strings are a permutation of each other; dog=god=odg
		 sol1. we can sort both and compare. we can ask if spaces or capital letters matter
		 sol2. have an array of all characters, go through each string and increase the count for that particular char. then compare
		 similar array for both strings 
		 */
		if(str1.length()!=str2.length()) {
			return false;
		}
		char[] strA = str1.toCharArray();
		java.util.Arrays.sort(strA);
		char[] strB = str2.toCharArray();
		java.util.Arrays.sort(strB);
		return strA.equals(strB);			
	}
	
	boolean isPalindrome(String phrase) {
		/*
		 sol1. reverse one string and compare
		 sol2.  go through phrase char by char, and see if there are more than 1 odd char count, return false
		 */
		int countOdd = 0;
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		for (char c : phrase.toCharArray()) {
			int x=0 ;//= getCharNumber(c);//implement
			if (x != -1) {
				table[x]++;
				if (table[x] % 2 == 1) {
					countOdd++;
				} else {
					countOdd--;
				}
			}
		 }
		 return countOdd <= 1;
		 }

}
