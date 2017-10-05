/**
 * Cs 4753 Artificial Intelligence project 1
 * This program prints out the pathway from one point to final point(goal)
 * author: jun jie li
 * 2016-10-17
 */
import java.util.*;
public class Astarr {
   
    static PriorityQueue<Cell> available;         // a collection of object  nodes
     
    static class Cell{  
    	
        int hCost = 0;              //heuristic cost
        int finalCost = 0;          //G function+H function
        int i; 
        int j;
        
        Cell parent; 
        
        Cell(int i, int j){
            this.i = i;
            this.j = j; 
        }
      
        public String toString(){                // prints out the path (cordinates of i and j);
        	
            return "["+this.i+", "+this.j+"]";
        }
    }
  
    static Cell [][] grid = new Cell[5][5];    // Xs are null values in grid
     
    static boolean notAvailable[][];          
    
    static int initialPointI, initialPointJ;   // cordinate for i and j
    
    static int endPointI, endPointJ;
    
    
    public static void setXs (int i, int j){
    	
        grid[i][j] = null;
        
    }
    
    public static void setStartPoint(int i, int j){
    	
    	initialPointI = i;
    	initialPointJ = j;
    }
    
    public static void setEndPoint(int i, int j){
    	
        endPointI = i;
        endPointJ = j; 
        
    }
    
    /*
     * this method check and update eac cost for object Cell current and store in the available list
     * return void
     */
    static void updatCost(Cell current, Cell c, int cost){        
    	
        if(c == null || notAvailable[c.i][c.j]){
        	
        	return;
        }
        
        int temp = c.hCost+cost;
        
        boolean open = available.contains(c);
        
        if(!open || temp<c.finalCost){
        	
            c.finalCost = temp;
            
            c.parent = current;
            
            if(!open){
            	
            	available.add(c);	
            }
        }
    }
    
    /*
     * this method use *A algorithm to move each node
     * return void
     */
    public static void AStarALgorithm(){ 
    	 
    	available.add(grid[initialPointI][initialPointJ]);    //add the cordinates of the starting point to the available list.
        
        Cell current;
        
        while(true){ 
        	
            current = available.poll();
            
            if(current==null){
            	break;
            }
            
            notAvailable[current.i][current.j]=true; 

            if(current.equals(grid[endPointI][endPointJ])){ 
            	
                return; 
            }
            
            Cell t;  //  t= h, f, i, j
            
            if(current.i-1>=0){     // current h,f,i,j
            	
                t = grid[current.i-1][current.j];      // move up
                
                updatCost(current, t, current.finalCost); 
                
        
                if(current.j+1<grid[0].length){   
                	
                    t = grid[current.i-1][current.j+1];
                    
                    updatCost(current, t, current.finalCost); 
                }
            } 
            
            if(current.j-1>=0){     // move left
            	
                t = grid[current.i][current.j-1];
                
                updatCost(current, t, current.finalCost); 
            }
            
            if(current.j+1<grid[0].length){   // move right
            	
                t = grid[current.i][current.j+1];
                
                updatCost(current, t, current.finalCost); 
            }
            
            if(current.i+1<grid.length){   // move down
            	
                t = grid[current.i+1][current.j];
                
                updatCost(current, t, current.finalCost); 
                
            }
        }
  
    }
    
  
    public static void test( int x, int y, int si, int sj, int ei, int ej, int[][] Xs){
    	
    	grid = new Cell[x][y];           // x and y are the dimension of the map
    	notAvailable = new boolean[x][y];
    	
    	available = new PriorityQueue<>((Object o1, Object o2) -> {   
  
        	Cell c1 = (Cell) o1;
            Cell c2 = (Cell) o2;
            
            return c1.finalCost<c2.finalCost?-1:
                c1.finalCost>c2.finalCost?1:0;
        });
    	
    	setStartPoint(si, sj);     // the cordinates of the starting point 
        
    	setEndPoint(ei, ej);       // the corndinates of the ending point
    	 
        for(int i=0;i<x;++i){
        	
            for(int j=0;j<y;++j){
            	
                grid[i][j] = new Cell(i, j);
                grid[i][j].hCost = Math.abs(i-endPointI)+Math.abs(j-endPointJ);

            }

        }
        
        grid[si][sj].finalCost = 0;
        
        for(int i=0;i<Xs.length;++i){          // Xs are blocks on the map and the array of Xs are the X location on the map 
        	setXs(Xs[i][0], Xs[i][1]);         // set the locaiton of Xs
        }									
        
        
        for(int i=0;i<Xs.length;++i){           //set Xs
        	setXs(Xs[i][0], Xs[i][1]);
        }
            
        System.out.println("Map:\n ");        // print out the map;
        
        for(int i=0;i<x;++i){
        	
            for(int j=0;j<y;++j){
            	
               if(i==si&&j==sj){               // prints S
            	   System.out.print("SS  ");
               } 
               
               else if(i==ei && j==ej){
            	   System.out.print("FF  ");
               }  //Destination
               
               else if(grid[i][j]!=null){
            	   System.out.printf("%-3d ", 0);
               }
               
               else System.out.print("XX  "); 
            }
            System.out.println();
        }
        
        AStarALgorithm(); 
        
        System.out.println("\nScores for cells: ");
        
        for(int i=0;i<x;++i){
        	
            for(int j=0;j<x;++j){
            	
                if(grid[i][j]!=null){
                	
                	System.out.printf("%-3d ", grid[i][j].finalCost);
                }
                
                else System.out.print("XX  ");
            }
            
            System.out.println();
        }
        
        System.out.println();
        
        if(notAvailable[endPointI][endPointJ]){
        	
           
             System.out.println("Path: ");             
             
             Cell current = grid[endPointI][endPointJ];
             
             System.out.print(current);
             
             while(current.parent!=null){
            	 
                 System.out.print(" <- "+current.parent);
                 
                 current = current.parent;
             } 
             
             System.out.println();
        }
        
        else{
        	
        	System.out.println("No possible path");	
        }	
    }

    public static void main(String[] args) throws Exception{   
    	
    	Scanner in= new Scanner(System.in);
   
    	System.out.println("enter the number of row for dimension of the map:  ");
    	int drow=in.nextInt();
    	System.out.println("enter the number of colom for dimension of the map:  ");
    	int dcol=in.nextInt();
    	System.out.println("enter cordinate for starting point i ");
    	int SSi=in.nextInt();
    	System.out.println("enter cordinate for starting point j ");
    	int SSj= in.nextInt();
    	System.out.println("enter cordinate for destination point i ");
    	int FFi=in.nextInt();
    	System.out.println("enter cordinate for destination point j ");
    	int FFj=in.nextInt();
    	
    	System.out.println();
    	
    	test(drow, dcol, SSi, SSj, FFi, FFj, new int[][]{{2,2},{3,2},{4,2},{2,3},{2,4},{2,5},{2,6},{3,6},{4,6}});
    	
        //test(8, 8, 4, 4, 1, 2, new int[][]{{2,2},{3,2},{4,2},{2,3},{2,4},{2,5},{2,6},{3,6},{4,6}});
        
       
    }
    
    
    
}

