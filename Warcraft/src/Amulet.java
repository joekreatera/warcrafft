
public class Amulet extends Item {

	public Amulet(int type) {
		super();
		this.setType(type);
	}
	
	@Override
	public void take(Creature creature) {
	
		if( this.isDestroyed() ) return;
		
		if( this.getType() == Item.ELF_ITEM) {
			if( creature.getType() == Creature.ELF) {
				
				creature.setMagic( creature.getMagic() + 10);
				
			}
			
		}else if( this.getType() == Item.ORC_ITEM) {
				if( creature.getType() == Creature.ORC) {
					
					creature.setMagic( creature.getMagic() + 6);
					
				}
				
		}

		this.setDestroyed(true);

	}
	
		
}
	
