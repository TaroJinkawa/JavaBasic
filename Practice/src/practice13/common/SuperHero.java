package practice13.common;

public class SuperHero extends Hero{

	public SuperHero(){
		super();

	}

	Item equipment;


	public int attack() {
		return super.attack()+equipment.getadditionaldamage();
	}

	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}
	public Item getEquipment() {
		return this.equipment;
	}

}
