package project_1;

public class Tile {


   private final boolean isWall;
   private final boolean isExit;
   
   
   public Tile(boolean isWall , boolean isExit) {
	   this.isWall = isWall;
	   this.isExit = isExit;
   }
    public boolean isWall() {
    	return isWall;
    }
    
    public boolean isExit()   {
    	return isExit;
    }
    }
