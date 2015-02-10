public class Position {
	int x;
	int y;
	
	public Position(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public Position(){
		x=(int)(Math.random()*100);
		y=(int)(Math.random()*100);
	}
	
}