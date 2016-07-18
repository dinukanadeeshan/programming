import java.util.*;
class ZeroCount{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input the Number : ");
		int x=input.nextInt();
		int zero=0;
		
		for(int i=0;i<20;i++){
			if(x!=0){
				if(x%10==0){
					zero++;
				}
				x/=10;
			}
		}
		System.out.println("Number has "+zero+" Zeros..");
	}
}