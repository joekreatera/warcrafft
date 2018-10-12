
public class Creature {
	
	private int type;
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}


	public static final int ORC = 0;
	public static final int ELF = 1;
	
	
	public Creature() {
		
		px = WarWorld.getRandomBetween( WarWorld.getLeftBound(), WarWorld.getRightBound() );
		py = WarWorld.getRandomBetween(WarWorld.getBottomBound(), WarWorld.getTopBound() );
		vx = WarWorld.getRandomBetween(-3,3 );
		vy = WarWorld.getRandomBetween(-3,3);
		
		
	}
	
	public int getPower() {
		
		if( Math.random() > 0.5f) {
			// attack
			
		}
		return 0;
	}
	
	public String toString() {
		
		return "x:" + px + " y:" + py;
		
	}
	
	public void advance() {
		
		if( px+vx > WarWorld.getRightBound() ) {
			vx *= -1;
		}
		if( px+vx < WarWorld.getLeftBound()) {
			vx *= -1;
		}
		
		if( py+vy > WarWorld.getTopBound() ) {
			vy *= -1;
		}
		if( py+vy < WarWorld.getBottomBound() ) {
			vy *= -1;
		}
		
		px += vx;
		py += vy;
		
	}
	
	
	public int attack;
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public int getMagic() {
		return magic;
	}
	public void setMagic(int magic) {
		this.magic = magic;
	}
	public int getVx() {
		return vx;
	}
	public void setVx(int vx) {
		this.vx = vx;
	}
	public int getVy() {
		return vy;
	}
	public void setVy(int vy) {
		this.vy = vy;
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
	public int life;
	public int magic;
	public int vx;
	public int vy;
	public int px;
	public int py;
	

}
