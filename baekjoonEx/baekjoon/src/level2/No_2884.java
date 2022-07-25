package level2;

import java.util.Scanner;

public class No_2884 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt();
		int M=sc.nextInt();
		M=H*60+M-45;
		if(M<0)
			M=24*60+M;
		
        H=M/60;
        M=M%60;
		System.out.print(H+ " " + M);
	}

}
