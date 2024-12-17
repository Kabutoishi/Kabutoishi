package jp.co.f1.intro.ch2;

import java.util.ArrayList;

public class UseArrayList2 {

	public static void main(String[] args) {
		//文字列を扱うArrayList配列
		
		ArrayList<String> strList = new ArrayList<String>();
		
		//１つ目の文字列を追加と表示
		strList.add("Good morning");
		System.out.println("1つめの格納データは「" + strList.get(0) + "」です。");
		
	    //２つ目の文字列を追加と表示
		strList.add("Hello");
		System.out.println("2つめの格納データは「" + strList.get(1) + "」です。");
		
		//３つ目の文字列を追加と表示
				strList.add("Bye");
				System.out.println("2つめの格納データは「" + strList.get(2) + "」です。");

	}

}
