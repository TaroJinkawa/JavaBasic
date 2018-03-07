package practice13.common;

public class Item {
//-----------------フィールド------------------//
	private String name;
	private int additionalDamage;
//-----------------フィールド------------------//
//-----------------メソッド------------------//
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setAdditionalDamage(int additionaldamage) {
		this.additionalDamage = additionaldamage;
	}
	public int getadditionaldamage() {
		return this.additionalDamage;
	}
	//-----------------メソッド------------------//
	//-----------------コンストラクタ------------------//
	public Item(String name,int additionalDamage) {
		this.name = name;
		this.additionalDamage = additionalDamage;
	}
	//-----------------メソッド------------------//


}
