package project_1;

public class Player {

	private int x;
	private int y;
	private int energy;
	
	public Player (int startX ,int startY, int startEnergy) {
		this.x = startX;
		this.y = startY;
		this.energy = startEnergy;
		
	
}
	public void moveUp() {y++;}
	public void moveDown() {y--;}
	public void moveLeft() {x--;}
	public void moveRight() {x++;}
	
	public int getX() {return x; }
	public int getY() {return y; }
	public int getEnergy() {return energy;}
	
	public void decreaseEnergy(int amount) {
	    energy -= amount;
	}
}
	
