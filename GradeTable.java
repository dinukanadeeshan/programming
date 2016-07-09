import java.util.*;
class GradeTable{
	public  static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input no of Students : "); 
		int n=input.nextInt();
		System.out.print("Input no of Subjects : "); 
		int s=input.nextInt();
		int [][]st=new int[n][s];
		for(int i=0;i<n;i++){
			System.out.println("Input marks for student "+(i+1)+"...:");
			for(int j=0;j<s;j++){
				System.out.print("\tSubject "+(j+1)+" : ");
				st[i][j]=input.nextInt();
			}
		}
		
		//find max of subject(stu);
		int []maxSub=new int[n];
		for(int j=0;j<n;j++){
			maxSub[j]=st[j][0];
			for(int i=1;i<s;i++){
				if(st[j][i]>maxSub[j]){
					maxSub[j]=st[j][i];
				}
			}
		}
		//Find Min	subject(stu)
		int[] minSub=new int[n];
		for(int i=0;i<n;i++){
			minSub[i]=st[i][0];
			for(int j=1;j<s;j++){
				if(st[i][j]<minSub[i]){
					minSub[i]=st[i][j];
				}
			}
		}
		//find Total of subject(stu)
		int[] totalSub=new int[n];
		for(int i=0;i<n;i++){
			totalSub[i]=0;
			for(int j=0;j<s;j++){
				totalSub[i]+=st[i][j];
			}
		}



		//find 	avg of subject(stu)
		double[] avgSub=new double[n];
		for(int i=0;i<n;i++){
			avgSub[i]=(double)totalSub[i]/s;
		}
		//Find Grade of student
		char[] gradeSt=new char[n];
		for(int i=0;i<n;i++){
			if(avgSub[i]>=75){
				gradeSt[i]='A';
			}else if(avgSub[i]>=65){
				gradeSt[i]='B';
			}else if(avgSub[i]>=55){
				gradeSt[i]='C';
			}else if(avgSub[i]>=35){
				gradeSt[i]='S';
			}else{
				gradeSt[i]='F';
			}
		}
		//Display
		System.out.print("Stu.No\t");
		for(int i=0;i<s;i++){
			System.out.print("Sub"+(i+1)+"\t");
		}
		System.out.println("Max\tMin\tTotal\tAvg\tGrade");
		for(int j=0;j<n;j++){
			System.out.print(j+1+"\t");
			for(int i=0;i<s;i++){	
				System.out.print(st[j][i]+"\t");
			}
			System.out.print(maxSub[j]+"\t");
			System.out.print(minSub[j]+"\t");
			System.out.print(totalSub[j]+"\t");
			System.out.print(avgSub[j]+"\t");
			System.out.print(gradeSt[j]+"\t");
			System.out.println();
		}
		//Find max of Sub(tea)
		int[] maxTea=new int[s];
		for(int i=0;i<s;i++){
			maxTea[i]=st[0][i];
			for(int j=0;j<n;j++){
				if(st[j][i]>maxTea[i]){
					maxTea[i]=st[j][i];
				}
			}
		}
		//Find min of sub(Tea)
		int[] minTea=new int[s];
		for(int i=0;i<s;i++){
			minTea[i]=st[0][i];
			for(int j=0;j<n;j++){
				if(st[j][i]<minTea[i]){
					minTea[i]=st[j][i];
				}
			}
		}
		//Find total of sub(tea)
		int[] totalTea=new int[s];
		for(int i=0;i<s;i++){
			for(int j=0;j<n;j++){
				totalTea[i]+=st[j][i];
			}
		}
		//Find avg of Sub(Tea)
		double[] avgTea=new double[s];
		for(int i=0;i<s;i++){
			avgTea[i]=(double)totalTea[i]/n;
		}
		//Find Grade of sub(Tea)
		char[] gradeTea=new char[s];
		for(int i=0;i<s;i++){
			if(avgTea[i]>=75){
				gradeTea[i]='A';
			}else if(avgTea[i]>=65){
				gradeTea[i]='B';
			}else if(avgTea[i]>=55){
				gradeTea[i]='C';
			}else if(avgTea[i]>=35){
				gradeTea[i]='S';
			}else{
				gradeTea[i]='F';
			}
		}
		//Display
		System.out.print("Max\t");
		for(int i=0;i<s;i++){
			System.out.print(maxTea[i]+"\t");
		}
		System.out.print("\nMin\t");
		for(int i=0;i<s;i++){
			System.out.print(minTea[i]+"\t");
		}		


		System.out.print("\nTotal\t");
		for(int i=0;i<s;i++){
			System.out.print(totalTea[i]+"\t");
		}
		System.out.print("\nAvg\t");
		for(int i=0;i<s;i++){
			System.out.print(avgTea[i]+"\t");
		}
		System.out.print("\nGrade\t");
		for(int i=0;i<s;i++){
			System.out.print(gradeTea[i]+"\t");
		}
		System.out.println();
	}
}

