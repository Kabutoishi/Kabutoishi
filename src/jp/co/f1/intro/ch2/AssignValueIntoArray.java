package jp.co.f1.intro.ch2;

public class AssignValueIntoArray {

	public static void main(String[] args) {
		
		//住居年数を管理する為の変数の宣言と要素の作成
		int[] kandaMansion = new int[3];
		
		//要素の初期化
		kandaMansion[0] = 3;
		kandaMansion[1] = 1;
		kandaMansion[2] = 10;
		
		System.out.println("0号室の居住年数 : " + kandaMansion[0]);
		System.out.println("1号室の居住年数 : " + kandaMansion[1]);
		System.out.println("2号室の居住年数 : " + kandaMansion[2]);

	}

}
