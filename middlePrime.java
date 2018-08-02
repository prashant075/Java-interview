import java.util.*;

class middlePrime{
	static boolean middleprime(int input){
		boolean isprime = true;
		if(input <=1){
			isprime = false;
			return isprime;
		}
		for(int i=2;i<=input/2;i++){
			if(input % 2 == 0){
				isprime =false;
				break;
			}
		}
		return isprime;
	} 
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		//int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		for(int i=b ;i < c;i++){
			if(middleprime(i)){
				System.out.println(i);
			}
		}
	}
}