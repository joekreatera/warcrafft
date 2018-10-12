
public class Weapon extends Item {

	@Override
	public void take(Creature creature) {
	
		if( this.isDestroyed() ) return;
		
		if( creature.getType() == Creature.ELF) {
			creature.setAttack( creature.getAttack() + 5);
				
			
		}
		
		if( creature.getType() == Creature.ORC) {
			creature.setAttack( creature.getAttack() + 7);
				
			
		}
		this.setDestroyed(true);
		
	}
}
