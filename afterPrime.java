import java.util.*;
class afterPrime{
	static boolean afterprime(int input){
		boolean isprime = true;
		if(input <=1){
			isprime = false;
			return isprime;
		}
		for(int i=2;i<= input/2;i++){
			if(input % i == 0){
				isprime =false;
				break;
			}
		}
		return isprime;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = sc.nextInt();
		int start = n +1;
		int count =1;
		while( count <= a){
			if(afterPrime.afterprime(start)){
				System.out.println(start);
				count++;
				start++;
			}else{
				start++;
			}
		}
	}
}