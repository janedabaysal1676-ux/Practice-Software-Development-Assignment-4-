package project_1;
import java.util.Random;
public class Maze {
	private final Tile[][] grid ;
	private final int size;
	
	
	public Maze(int size)   {
		this.size= size;
		this.grid=  new Tile [size][size];
		
		
		for (int row =0; row< size; row++) {
			 for (int col =0; col<size; col++) {
				 grid[row][col] =new Tile(false, false);
			 }
		}
				 
				 Random rnd = new Random();
				 int exitX =rnd.nextInt(size);
				 int exitY =rnd.nextInt(size);
				 
				 while (exitX ==0  && exitY ==0) {
					 exitX = rnd.nextInt(size);
			         exitY = rnd.nextInt(size);
					 
				      
				 }
				 int exitRow =(size - 1) - exitY;
				 int exitCol =exitX;
				 grid[exitRow][exitCol] = new Tile(false, true);
				 
				 
				int wallCount = size;
				int placed = 0;
				
				while (placed <wallCount) {
					
				
					int wx = rnd.nextInt(size);
					int wy = rnd.nextInt(size);
					
					if(wx == 0 && wy== 0) continue;
					if(wx == exitX && wy == exitY) continue;
					
					int wRow = (size-1)- wy;
					int wCol = wx;
					
					
					if (grid[wRow][wCol].isWall()) continue;
			
					grid[wRow][wCol] = new Tile(true, false);
					placed++; 
				}
			 
			 }
	public int getSize()  {
		return size;
	}

	
	public Tile getTile(int x, int y) {
		int row =(size - 1) -y;
		int col= x;
		
		return grid[row][col];
	}
}

		
