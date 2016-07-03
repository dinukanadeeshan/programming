
import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner i=new Scanner(System.in);
		boolean b=isPrime(i.nextLong());
		System.out.println(b);
	}
	
	public static boolean isPrime(long x){
		if (x==2) return true;
		if (x%2==0) return false;
		
		for(long i=3;i<(Math.sqrt(x));i+=2){
			if (x%i==0) return false;
		}
		
		return true;
		}
}
