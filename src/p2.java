/*Ryan Haines
 Project Euler problem #2

 Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
 By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
find the sum of the even-valued terms.
 */

public class p2 {

	String myName;
	long myAnswer;
	String myAnnounce;

	public p2(){
		myName = "p2";
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
		int current = 1;
		int previous = 1;
		int temp;
		while(current < 4000000){
			if (current %2 == 0){
				myAnswer += current;
			}
			temp = current;
			current += previous;
			previous = temp;
		}
		return myAnswer;
	}

}