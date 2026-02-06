package project_1;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int size =8;
		int startEnergy=15 ;
		
		
		Maze maze= new Maze(size);
		Player player = new Player(0 , 0, startEnergy);
		Scanner sc = new Scanner(System.in);
		
		
		while ( true) {
			System.out.println("Position:( " + player.getX()+ "," + player.getY()+ ")");
			System.out.println("Energy:" + player.getEnergy());
        	System.out.println("Move (	W/A/S/D, Q to quit) :");
        	
        	String input = sc.nextLine().toUpperCase();
   
					if(input.equals("Q")) {
        				System.out.println("Game quit.");
        				break;
        			}
        	int newX = player.getX();
        	int newY = player.getY();
        	
        	switch (input) {
        	case "W" : newY++ ;break;
        	case "S" : newY-- ; break;
        	case "A" : newX-- ; break;
        	case "D" : newX++ ; break;
        	default:
        		System.out.println("Invalid input ! ");
        		continue;
        	}
        	 if (newX < 0 || newX>= size || newY < 0 || newY>= size) {
        		 System.out.println("You cannot move outside the maze.");
        		 continue;
        	
        	}
        			Tile target = maze.getTile(newX, newY);
        			
        			if (target.isWall()) {
        				System.out.println(" You hit a wall !");
        				continue;
        			}
        			
        			
        			if(newX > player.getX()) player.moveRight();
        			else if (newX < player.getX()) player.moveLeft();
        			else if (newY >player.getY()) player.moveUp();
        			else if (newY < player.getY()) player.moveDown();
        			
        			player.decreaseEnergy(1);
        			
        			
        			if (target.isExit())  {
        				System.out.println("you escaped the maze!");
        						break;
        						
        			}
        			
        			if (player.getEnergy()  <= 0)  {
        				System.out.println("GAME OVER!  YOU RAN OUT OF ENERGY.");
        				break;
        	}
		}
        
        sc.close();
	}
	
}
