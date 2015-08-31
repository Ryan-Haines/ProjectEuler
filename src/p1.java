/*Ryan Haines
 Project Euler problem #1

 If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 The sum of these multiples is 23.

 Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class p1 {

	String myName;
	long myAnswer;
	String myAnnounce;

	public p1(){
		myName = "p1";
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

	//calculate the answer and assign it
	long calculate(){
		int sum = 0;
		for (int i = 0; i < 1000; i++){
			if (i % 3 == 0 || i % 5 == 0){
				sum += i;
			}
		}
		myAnswer = sum;
		return myAnswer;
	}

}
