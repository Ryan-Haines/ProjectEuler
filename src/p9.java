/*Ryan Haines
Project Euler problem #

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

*/
public class p9 {

	String myName;
	long myAnswer;
	String myAnnounce;

	public p9(){
		myName = "p9";
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
	
	boolean isTriplet(int a, int b, int c){
		return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
	}
	
	boolean is1kTriplet(int a, int b, int c){
		return isTriplet(a,b,c) && a+b+c == 1000;
	}

	//calculate the answer and assign it
	long calculate(){
		int a = 1;
		boolean kTripFound = false;
		while(!kTripFound){
			for(int i = a +1; i < 500; i++){
				int b = i;
				float c = (float)(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
				if(c % 1 == 0){
					//triple found
					if(is1kTriplet(a,b,(int)c)){
						myAnswer= (a*b*(int)c);
						kTripFound = true;
					}
				}
			}
			a++;
		}
		return myAnswer;
	}

}