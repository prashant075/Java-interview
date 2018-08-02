import java.util.*;
class nextPrime{
	static boolean nextprime(int input){
		boolean isprime = true;
		if(input <=1){
			isprime = false;
			return isprime;
		}
		for(int i =2; i< input /2 ;i++){
			if(input % i == 0){
				isprime = false;
				break;
			}
		}
		return isprime;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int number =2;
		int count =1;
		while(count <= a){
			int first = number;
			int second = number +4;
			if(nextprime(first) && nextprime(second)){
				System.out.println(second);
				count++;
				number++;
			}else{
				number++;
			}
			
		}
	}
}