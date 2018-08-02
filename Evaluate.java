class Evaluate{
	
	int number(char ch){
				int  num = Integer.parseInt(String.valueOf(ch));
		return num;
	}
	  String eval(String  str){
		char [] ch = str.toCharArray();
		int num = 0;
		int sum = 0;
		String v  ="";
		for(int i=0; i< ch.length ;i++){
			int num1 = number(ch[i]);
			int num2 = number(ch[i+2]);
			
			if(ch[i+1]=='+'){
				sum = num1 + num2;
			}else if(ch[i+1] =='*')
			{
				sum = num1 * num2;
			}else if(ch[i+1] =='/'){
				sum = num1 /num2;
			}else if(ch[i+1] =='-'){
				sum = num1 - num2;
			}
			v = eval(Integer.toString(sum)+str.substring(i+2));
			
		}
		System.out.println(v);
		return "1";
	}
	public static void main(String[] args){
		Evaluate ev = new Evaluate();
		 String i =ev.eval("3+2");
		//System.out.println(sum);
	}
}