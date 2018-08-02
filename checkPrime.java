import java.util.*;
class checkPrime{
	static boolean prime(int n){
		boolean isprime = true;
		if(n <= 1){
			isprime = false;
			return isprime;
		}
		
		for(int i = 2; i <= n/2;i++ ){
			if(n % i ==0){
				isprime = false;
				break;
			}
		}
		return isprime;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean res = checkPrime.prime(a);
		if(res){
			System.out.println("Prime");
		}else{
			System.out.println("Not Prime");
		}
	}
}