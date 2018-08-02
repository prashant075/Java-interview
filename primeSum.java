import java.util.*;
class primeSum{
	static boolean primesum(int input){
		boolean isprime = true;
		if(input <=1){
			isprime = false;
			return isprime;
		}
		for(int i =2; i <= input/2;i++  ){
			if(input % i ==0){
				isprime = false;
				break;
			}
		}
		return isprime;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b = 2;//sc.nextInt();
		int count=1;
		int sum =0;
		while(count <=a){
			if(primesum(b)){
				System.out.println(b);
				sum =sum + b;
				count++;
				b++;
			}else{
				b++;
			}
		}
		System.out.println(sum);
	}
}