/*Ryan Haines
Project Euler problem #

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/
public class p10 {

	String myName;
	long myAnswer;
	String myAnnounce;

	public p10(){
		myName = "p10";
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
		//special cases for 1 (not prime) and 2 (only even prime)
		if (testNum == 2)
			return true;
		else if(testNum % 2 == 0 || testNum < 2)
			return false;
		//test all other numbers starting with 3
		for (long i = 3; i <= Math.sqrt(testNum) + 1 ; i+=2){
			if(testNum % i == 0)
				return false;
		}
		return true;
	}
	
	//calculate the answer and assign it
	long calculate(){
		long sum = 2;
		long count = 3;
		while(count <= 2000000){
			if (isPrime(count))
				sum +=count;
			count+=2;
		}
		myAnswer = sum;
		return myAnswer;
	}

}