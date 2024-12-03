package jp.co.f1.intro.ch2;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
	
	System.out.println("1:お茶　2:コーヒー　3:紅茶　4:ミネ");
	System.out.println("好きな飲み物の番号を押してください。>");
	
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	
	switch(num) {
	case 1:
		System.out.println("100円です。");
		break;
	
	case 2:
		System.out.println("200円です。");
		break;
	
	case 3:
		System.out.println("300円です。");
		break;
		
	case 4:
		System.out.println("400円です。");
		break;
		
	default :
		System.out.println("番号が不正です。");
		break;
		
	}
		
		
	}

}
