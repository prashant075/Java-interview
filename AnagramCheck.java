import java.util.*;
class AnagramCheck{
	static void checkanagram(String str1, String str2){
		String mystr1 = str1.replaceAll("\\s","");
		String mystr2 = str2.replaceAll("\\s","");
		boolean status = true;
		if(mystr1.length() != mystr2.length()){
			status = false;
			
		}else{
			char[] array1 = mystr1.toLowerCase().toCharArray();
			char[] array2 = mystr2.toLowerCase().toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			status = Arrays.equals(array1,array2);
		}
		if(status){
			System.out.println("Anagram");
		}else{
			System.out.println("Not Anagram");
		}	
		
	}
	public static void main(String [] args){
		checkanagram("Prashant Gupta", "Prashant Guptt");
		checkanagram("DORMITORY", "Dirty Room");
	}
}
