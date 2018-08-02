import java.util.*;
class intialPrime{
	static boolean intialprime(int input){
		boolean isprime = true;
	if(input <=1){
			isprime = false;
			return isprime;
		}
		for(int i=2;i <=input/2;i++){
			if(input % i==0){
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
		while(count <=a){
			if(intialPrime.intialprime(number)){
				System.out.println(number);
				count++;
				number++;
			}else{
				number++;
			}
		}
	}
	
}
