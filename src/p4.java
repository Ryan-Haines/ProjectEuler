/*
Ryan Haines
Project Euler problem 4

A palindromic number reads the same both ways. 
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

public class p4 {

	String myName;
	long myAnswer;
	String myAnnounce;

	public p4(){
		myName = "p4";
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

	//is the given integer a palindrome
	boolean isPalindrome(int test){
		String testStr = Integer.toString(test);
		boolean isPalindrome = true;
		int j = testStr.length()-1;
		for (int i = 0; i<testStr.length() / 2; i++){
			if(testStr.charAt(i) != testStr.charAt(j))
				isPalindrome = false;
			j--;
		}
		return isPalindrome;
	}
	
	//calculate the answer and assign it
	long calculate(){
		//MEAT GOES HERE
		int largest = 0;
		for(int i = 999; i > 99; i--){
			for(int j = i; j > 99; j--){
				if (isPalindrome(i*j))
					largest = Math.max(largest, i*j);
			}
		}
		myAnswer = largest;
		return myAnswer;
	}

}