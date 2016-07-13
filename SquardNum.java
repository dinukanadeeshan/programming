import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		int y=0;
		for(int i=0;i<x/4;i++){
			if(i*i==x){
				y=1;
			}
		}
		if(y!=0){
			System.out.println("This is a Square Number");
		}else{
			System.out.println("This is not a Square Number");
		}	
	}
}
