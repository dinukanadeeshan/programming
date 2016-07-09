import java.util.*;
class MagicBox{
	public static void main(String args[]){
		Random r=new Random();
		int[][]x=new int[3][3];
		boolean v15=false;
		L2 :while(!v15){
			x=new int[3][3];
			 for(int i = 0 ; i < 3 ; i++ ){
				for(int j = 0 ; j < 3; j++){
					x[i][j]=r.nextInt(9)+1;
				}
			}
			L1 : for(int i = 0 ; i < 3 ; i++ ){
				for(int j = 0 ; j < 3; j++){
					for(int k=0;k<3;k++){
						for(int l=0;l<3;l++){
							if(x[i][j]==x[k][l]){
								if(i!=k||j!=l)
								continue L2;
							}
						}
					}
				}
			}
			boolean []a=new boolean[8];
			a[0]=x[0][0]+x[0][1]+x[0][2]==15;
			a[1]=x[1][0]+x[1][1]+x[1][2]==15;
			a[2]=x[2][0]+x[2][1]+x[2][2]==15;
			a[3]=x[0][0]+x[1][0]+x[2][0]==15;
			a[4]=x[0][1]+x[1][1]+x[2][1]==15;
			a[5]=x[0][2]+x[1][2]+x[2][2]==15;
			a[6]=x[0][0]+x[1][1]+x[2][2]==15;
			a[7]=x[0][2]+x[1][1]+x[2][0]==15;
			v15=a[0] && a[1]&& a[2]&& a[3]&& a[4]&& a[5]&& a[6]&& a[7];
		}
		for(int i = 0 ; i < 3 ; i++ ){
			for(int j = 0 ; j < 3; j++){
				System.out.print(x[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
