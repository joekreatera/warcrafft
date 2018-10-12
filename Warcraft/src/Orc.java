
public class Orc extends Creature {

	public Orc() {
		super();
		this.setMagic( WarWorld.getRandomBetween(0, 5)  );
		this.setAttack( WarWorld.getRandomBetween( 8 , 20 )  );
		this.setLife(110);
		this.setType(ORC);
			
	}
	
}
