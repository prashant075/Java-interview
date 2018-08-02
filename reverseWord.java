class reverseWord{
	public static void main(String[] args){
		String str = "Prashant Gupta";
		String  [] words = str.split(" ");
		String resever= "";
		for(int i=words.length-1; i >=0;i--){
			String reseverword = "";
			String ch = words[i];
			for(int j= ch.length()-1; j >=0;j--){
				reseverword = reseverword +ch.charAt(j); 
			}
			resever = resever + reseverword +" ";
		}
		System.out.println(resever);
	}
}