
public class Item {

	public static final int ORC_ITEM = 0;
	public static final int ELF_ITEM = 1;
	
	
	int px;
	int py;
	
	int magic;
	int attack;
	
	boolean destroyed;
	
	int type;

	public Item() {
		
		px = WarWorld.getRandomBetween( WarWorld.getLeftBound(), WarWorld.getRightBound() );
		py = WarWorld.getRandomBetween(WarWorld.getBottomBound(), WarWorld.getTopBound() );
	}
	
	public void take(Creature creature) {
		System.out.println("FAKE!!!!!");
		
	}
	
	public String toString() {
		
		String str = "";
		if( type == Item.ELF_ITEM) {
			str = "ELF ITEM (" + px + "," + py + "):" + this.destroyed;
		}else {
			str = "ORC ITEM (" + px + "," + py + "):" + this.destroyed;
		}
		
		return str;
		
	}
	
	public int getPx() {
		return px;
	}

	public void setPx(int px) {
		this.px = px;
	}

	public int getPy() {
		return py;
	}

	public void setPy(int py) {
		this.py = py;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public boolean isDestroyed() {
		return destroyed;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
}
