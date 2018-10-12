
public class Elf extends Creature {

	public Elf() {
		super();
		this.setMagic( WarWorld.getRandomBetween(15, 30)  );
		this.setAttack( WarWorld.getRandomBetween( 5 , 10 )  );
		this.setLife(90);
		this.setType(ELF);
		
	}
	
	
}
