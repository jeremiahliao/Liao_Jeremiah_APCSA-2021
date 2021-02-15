//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
   private int count;

	//add constructors
   	public Perfect(){
   		setNumber(0);
   	}
   	public Perfect(int num){
   		setNumber(num);
   	}

	//add a set method
   	public void setNumber(int num) {
   		number = num;
   		count = 0;
   		for(int i = 1; i < number; i++) {
			if(number%i == 0) {
				count += i;
			}
   		}
   	}

	public boolean isPerfect()
	{
		if(count == number) {
			return true;
		}
		else{return false;}
	}

	//add a toString
	public String toString(){
		if(isPerfect() == true)
		{
			return number + " is perfect.";
		}
		else {
		return number + " is not perfect.";
		}
	}
	
}