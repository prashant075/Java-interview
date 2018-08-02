import java.util.*;
class primeSet{
	static boolean primeset(int input){
		boolean ispime = true;
		if(input <=1){
			ispime = false;
			return ispime;
		}
		for(int i =2; i<= input/2;i++){
			if(input % i == 0){
				ispime = false;
				break;
			}
		}
		return ispime;
	}
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i= a ; i <=b;i++){
			int first =i;
			int sencond =i+2;
			if(primeset(first) && primeset(sencond)){
				System.out.println("("+first+ "," +sencond+")");
			}
		}
	}
}