import java.util.*;
import java.util.Scanner;
class PrimeNum{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		if(x==1){
			System.out.println("This is not a prime Number");
			System.exit(0);
		}
		if(x/2.0==1.0 || x/3.0==1.0 || x/5.0==1.0){
			System.out.println("This is a prime Number");
		}else if(x%2==0 || x%3==0 || x%5==0){
			System.out.println("This is not a prime Number");
		}else{
			System.out.println("This is  a prime Number");
		}
	}
}
