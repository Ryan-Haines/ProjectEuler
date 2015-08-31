/*Ryan Haines
Project Euler problem #

In the 20×20 grid below, four numbers along a diagonal line have been marked in red. (with a star)

08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08
49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00
81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65
52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91
22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80
24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50
32 98 81 28 64 23 67 10 26* 38 40 67 59 54 70 66 18 38 64 70
67 26 20 68 02 62 12 20 95 63* 94 39 63 08 40 91 66 49 94 21
24 55 58 05 66 73 99 26 97 17 78* 78 96 83 14 88 34 89 63 72
21 36 23 09 75 00 76 44 20 45 35 14* 00 61 33 97 34 31 33 95
78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92
16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57
86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58
19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40
04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66
88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69
04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36
20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16
20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54
01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48

The product of these numbers is 26 × 63 × 78 × 14 = 1788696.

What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20×20 grid?

*/
public class p11 {

	String myName;
	long myAnswer;
	String myAnnounce;
	String numbers = "08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08 49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00 81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65 52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91 22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80 24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50 32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70 67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21 24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72 21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95 78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92 16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57 86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58 19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40 04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66 88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69 04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36 20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16 20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54 01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48";
	int gridSize = 20;
	int[][] grid = new int[gridSize][gridSize];

	public p11(){
		createGrid();
		
		myName = "p11";
		myAnnounce = "The answer to ";
		myAnnounce = myAnnounce.concat(myName);
		myAnnounce = myAnnounce.concat(" is: ");
		long startTime = System.nanoTime();
		myAnnounce += this.calculate();
		long endTime = System.nanoTime();
		long duration = (endTime - startTime); //in nanoseconds
		myAnnounce = myAnnounce.concat(", calculated in ");
		myAnnounce += duration;
		myAnnounce = myAnnounce.concat("ns or ");
		long durationms = duration/1000000;
		myAnnounce += durationms;
		myAnnounce = myAnnounce.concat("ms");
	}
	
	String getName(){
		return myName;
	}
	
	long getAnswer(){
		return myAnswer;
	}
	
	String getAnnounce(){
		return myAnnounce;
	}
	
	int[][] getGrid(){
		return grid;
	}
	
	int getGridSize(){
		return gridSize;
	}
	
	void printAnswer(){
		System.out.println(this.getAnnounce());
	}
	
	//returns an integer scanning the string until string terminates
	//undefined for nonnumeric characters
	int stringToNum(String str){
		int num = 0;
		for(int i = 0; i<str.length(); i++){
			num*=10;
			num+=Character.getNumericValue(str.charAt(i));
		}
		//System.out.println(num);
		return num;
	}
	
	//return the number from the specified index
	int copyNum(int index, String numString){
		return stringToNum(numString.substring(index*3,(index*3)+2));
	}
	
	//inserts the individual numbers in a 2D array
	void createGrid(){
		for(int y = 0; y < gridSize; y++){
			for(int x = 0; x <gridSize; x++){
				grid[x][y] = copyNum(x + (y*gridSize), numbers);
				System.out.print(grid[x][y] + " ");
			}
			System.out.println("\n");
		}
	}
	
	//need to search l->r, t->b, tD -> bD, bD, -> td
	
	//search for the largest 4-number horizontal product
	int searchLR(int[][] searchGrid, int prodLen){
		int largest = 0;
		for(int y = 0; y < searchGrid.length; y++){
			for(int x = 0; x <= searchGrid.length - prodLen; x++){
				int product = searchGrid[y][x];
				for(int i = 1; i < prodLen; i++){
					product = product * searchGrid[y][x + i];
				}
				largest = Math.max(largest, product);
			}
		}
		return largest;
	}
	
	//search for the largest 4-number vertical product
	int searchTB(int[][] searchGrid, int prodLen){
		int largest = 0;
		for(int y = 0; y <= searchGrid.length - prodLen; y++){
			for(int x = 0; x < searchGrid.length; x++){
				int product = searchGrid[y][x];
				for(int i = 1; i < prodLen; i++){
					product = product * searchGrid[y + i][x];
				}
				largest = Math.max(largest, product);
			}
		}
		return largest;
	}
	
	//search for the largest 4-number diagonal from TL -> BR
	int searchTD(int[][] searchGrid, int prodLen){
		int largest = 0;
		for(int y = 0; y <= searchGrid.length - prodLen; y++){
			for(int x = 0; x <= searchGrid.length - prodLen; x++){
				int product = searchGrid[y][x];
				for(int i = 1; i < prodLen; i++){
					product = product * searchGrid[y + i][x + i];
				}
				largest = Math.max(largest, product);
			}
		}
		return largest;
	}
	
	//search for the largest 4-number diagonal from BL -> TR
	int searchBD(int[][] searchGrid, int prodLen){
		int largest = 0;
		for(int y = searchGrid.length - 1; y >= 0 + prodLen; y--){
			for(int x = 0; x <= searchGrid.length - prodLen; x++){
				int product = searchGrid[y][x];
				for(int i = 1; i < prodLen; i++){
					product = product * searchGrid[y - i][x + i];
				}
				largest = Math.max(largest, product);
			}
		}
		return largest;
	}
	
	
	//calculate the answer and assign it
	long calculate(){
		
		myAnswer = Math.max(searchLR(getGrid(), 4), 
					Math.max(searchTB(getGrid(), 4), 
					 Math.max(searchTD(getGrid(), 4), searchBD(getGrid(), 4))));
		
		 return myAnswer;
	}

}