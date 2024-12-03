package jp.co.f1.intro.ch2;

class Computer7 {
	  private String os; // インスタンス変数
	  private int memory; // インスタンス変数

	  public Computer7() { // コンストラクタ
	    this.os = null;
	    this.memory = 0;
	    System.out.println("パソコンを作成しました。");
	  }

	  public void setOsMemory(String os, int memory) { // インスタンスメソッド
	    this.os = os;
	    this.memory = memory;
	    System.out.println("OSを「" + os + "」にメモリを「" + memory + "MByte」に変更しました。");
	  }
	  public void show() { // インスタンスメソッド
	    System.out.println("パソコンのOSは「" + os + "」です。");
	    System.out.println("メモリサイズは「" + memory + "MByte」です。");
	  }
	}

	public class InstanceMember {
	  public static void main(String[] args) {
	    Computer7 com1 = new Computer7(); // com1オブジェクト作成(インスタンス作成)
	    com1.setOsMemory("WindowsXP", 2048); // com1オブジェクトのsetOsMemoryメソッド呼び出し
	    com1.show(); // com1オブジェクトのshowメソッド呼び出し
	    System.out.println("---------------------------------------------------------");
	    Computer7 com2 = new Computer7(); // com2オブジェクト作成(インスタンス作成)
	    com2.setOsMemory("Windows2000", 512); // com2オブジェクトのsetOsMemoryメソッド呼び出し
	    com2.show(); // com2オブジェクトのshowメソッド呼び出し
	  }
	}