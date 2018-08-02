class ReverseString{
	public static void main(String[] args){
		//using StringBuilder
		StringBuilder sbr = new StringBuilder("MYJAVA");
		String rev = sbr.reverse().toString();
		System.out.println(rev);

		//using for loop
		String str = "MYJAVA";
		char [] var = str.toCharArray();
		for(int i = var.length-1; i>=0;i--){
		System.out.print(var[i]);
		}
		System.out.println(" ");
		//using recursion
		System.out.println(revers("MYJAVA"));
	}
	static String revers(String mystr){
		if((null==mystr) || (mystr.length() <= 1)){
			return mystr;
		}
		return revers(mystr.substring(1)) + mystr.charAt(0);
	}
}
