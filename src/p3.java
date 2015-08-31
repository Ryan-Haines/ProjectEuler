/*Ryan Haines
 Project Euler problem #3
	
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */
public class p3 {

	String myName;
	long myAnswer;
	String myAnnounce;

	public p3(){
		myName = "p3";
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
	
	Object getAnnounce(){
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
		long num = 600851475143L; //not even, so 2 is special case
		long factor = 3;
		
		if (num % 2 == 0){
			myAnswer = 2;
			return myAnswer;
		}
		
		while (num > 1){
			if (num % factor == 0){
				//if we find a factor, remove it from our number
				//not needed to check for primes because since larger odds (ie 9, 25)
				//will have already been removed
				num /= factor;
			}
			else
				//factor not found, attempt next largest odd number
				factor +=2;
		}
		myAnswer = (int)factor;
		return myAnswer;
	}
}
