/*Ryan Haines
Project Euler problem 6

The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the 
first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the 
first one hundred natural numbers and the square of the sum.
*/
public class p6 {

	String myName;
	long myAnswer;
	String myAnnounce;

	public p6(){
		myName = "p6";
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
	
	void printAnswer(){
		System.out.println(this.getAnnounce());
	}

	int squareSumDiff(int calc){
		int sumSquares = 0;
		int squareSums = 0;
		for(int i = 0; i < calc+1; i++){
			sumSquares += Math.pow(i, 2);
			squareSums += i;
		}
		squareSums = (int)Math.pow(squareSums, 2);
		int difference = squareSums - sumSquares;
		return difference;
	}
	
	//calculate the answer and assign it
	long calculate(){
		myAnswer = squareSumDiff(100);
		 return myAnswer;
	}

}