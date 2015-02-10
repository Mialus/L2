public class Balle extends MovingPart{
	Position p1;
	Direction d1;
	
	
	public Balle(){
		p1=new Position();
		d1=new Direction();
	}
	
	public Balle(int xPos, int yPos, int xDir, int yDir) {
		this.p1=new Position(xPos, yPos);
		this.d1=new Direction(xDir,yDir);
	}
	
	public Balle(int xDir, int yDir) {
		this.p1=new Position();
		this.d1=new Direction(xDir,yDir);
	}

}