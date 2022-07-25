package level2;

import java.util.Scanner;

public class No_14681 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("x 값을 입력해주세요:");
		int x=sc.nextInt();
		System.out.print("y 값을 입력해주세요:");
		int y=sc.nextInt();
		if(x>0 && x<=1000 && y>0 && y<=1000) {
			System.out.println(1);
		}
		if(x<0 && x>=-1000 && y>0 && y<=1000) {
			System.out.println(2);
		}
		if(x<0 && x>=-1000 && y<0 && y>=-1000) {
			System.out.println(3);
		}
		if(x>0 && x<=1000 && y<0 && y>=-1000) {
			System.out.println(4);
		}
		

	}

}
