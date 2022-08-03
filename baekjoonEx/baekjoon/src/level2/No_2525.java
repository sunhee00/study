package level2;

import java.util.Scanner;

public class No_2525 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int H=sc.nextInt();
		int M=sc.nextInt();
		int dM=sc.nextInt();
		
		int result=H*60 + M + dM;
		H=result/60;
		M=result%60;
		if(H>=24) {
			H-=24;
		}
		System.out.println(H + " " + M);
	}

}
