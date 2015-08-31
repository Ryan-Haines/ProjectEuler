/*Ryan Haines
Project Euler problem #

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class p5 {

	String myName;
	long myAnswer;
	String myAnnounce;

	public p5(){
		myName = "p5";
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
	
	//is the given int divisible by all ints in range?
	boolean divisibleAll(int test, int range){
		boolean divisible = true;
		for(int i = 1; i < range+1; i++){
			if(test % i > 0){
				divisible = false;
				//break;
			}
		}
		return divisible;
	}

	//calculate the answer and assign it
	long calculate(){
		boolean found = false;
		int count = 0;
		while (!found){
			count+=2;
			if(divisibleAll(count, 20))
				found = true;
		}
		myAnswer = count;
		return myAnswer;
	}

}