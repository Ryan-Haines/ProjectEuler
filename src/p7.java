/*Ryan Haines
Project Euler problem 7

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
 */
public class p7 {

	String myName;
	long myAnswer;
	String myAnnounce;

	public p7(){
		myName = "p7";
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

	//true on 2, 3, 5, 7 
	//false on 4, 6, 9
	boolean isPrime(long testNum){
		testNum = Math.abs(testNum);
		//special cases
		if (testNum == 2)
			return true;
		else if(testNum % 2 == 0 || testNum <= 1)
			return false;
		//test all other numbers
		long i = 2;
		while(i < testNum){
			if(testNum % i == 0)
				return false;
			i++;
		}
		return true;
	}

	//calculate the answer and assign it
	long calculate(){
		int primesFound = 1;
		int counter = 1;
		while(primesFound < 10001){
			counter+=2;
			if(isPrime(counter))
				primesFound++;
		}
		myAnswer = counter;
		return myAnswer;
	}

}