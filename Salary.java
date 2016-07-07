import java.util.*;
class Salary{

 	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.print("Input Salary : ");
		int salary=input.nextInt();
		int a=salary/5000;
		salary%=5000;
		int b=salary/2000;
		salary%=2000;
		int c=salary/1000;
		salary%=1000;
		int d=salary/500;
		salary%=500;
		int e=salary/200;
		salary%=200;
		int f=salary/100;
		salary%=100;
		int g=salary/50;
		salary%=50;
		int h=salary/20;
		salary%=20;
		int i=salary/10;
		salary%=10;
		int j=salary/5;
		salary%=5;
		int k=salary/2;
		salary%=2;
		int l=salary/1;
		
		System.out.println("5000: "+a);
		System.out.println("2000: "+b);
		System.out.println("1000: "+c);
		System.out.println("500 : "+d);
		System.out.println("200 : "+e);
		System.out.println("100 : "+f);
		System.out.println("50  : "+g);
		System.out.println("20  : "+h);
		System.out.println("10  : "+i);
		System.out.println("5   : "+j);
		System.out.println("2   : "+k);		
		System.out.println("1   : "+l);
   	}
 
}