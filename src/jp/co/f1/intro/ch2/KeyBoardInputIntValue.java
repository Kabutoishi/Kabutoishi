package jp.co.f1.intro.ch2;

import java.util.Scanner;

public class KeyBoardInputIntValue{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
 		System.out.print("名前を入力して下さい＞");
 		String name = sc.nextLine();
 		System.out.println("私の名前は、" + name + "です。"); 
 		
 	}
 
 }