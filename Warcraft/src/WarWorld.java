
public class WarWorld {

	
	Creature creatures[];
	
	Item items[];
	
	public WarWorld() {
		
		creatures = new Creature[10];
	
		for(int i = 0; i <  creatures.length ; i++) {
			if( i%2 == 0) {
				creatures[i] = new Elf();
			}else {
				creatures[i] = new Orc();
			}
			
		}
		
		items = new Item[4];
		items[0] = new Weapon();
		items[1] = new Weapon();
		items[2] = new Amulet(Item.ELF_ITEM);
		items[3] = new Amulet(Item.ORC_ITEM);
		
	}
	
	public void day(int dayNumber) {
		
		System.out.println("-----------------------");
		for(int i = 0; i < creatures.length ; i++) {
			creatures[i].advance();
			
			for( int j = 0; j < items.length ; j++) {
				
				if( WarWorld.distanceBetween(creatures[i], items[j] ) < 5) {
					items[j].take(creatures[i]);
				}
				
			}
			
			System.out.println( i + ":" + creatures[i]);
		}
		System.out.println("#items#");
		
		for(int i = 0; i < items.length ; i++) {
			System.out.println( i + ":" + items[i]);
		}
		
	}
	
	public static int getRandomBetween(int a, int b) {
		
		return a + (int)(Math.random()*(b-a));
		
	}
	
	public static int getLeftBound() {
		return -100;
	}
	
	public static int getRightBound() {
		return 100;
	}
	
	public static int getTopBound() {
		return 100;
	}
	
	public static int getBottomBound() {
		return -100;
		
	}
	
	public static float distanceBetweenPoints(int x1, int y1, int x2, int y2) {
		
		return (float)Math.sqrt(   Math.pow(x2-x1, 2) +  Math.pow(y2-y1, 2)    );
		
	}
	
	public static float distanceBetween(Creature a, Creature b) {
		
		return  distanceBetweenPoints(a.getPx(), a.getPy(), b.getPx() , b.getPy() );
		
	}
	
	public static float distanceBetween(Creature a, Item i) {
	
		return  distanceBetweenPoints(a.getPx(), a.getPy(), i.getPx() , i.getPy() );
	}
	
	public static void main(String[] args) {
			
		WarWorld world = new WarWorld();
		
		for(int i= 0; i < 10 ; i++) {
			world.day(i);
		}

	}

	
	
}
