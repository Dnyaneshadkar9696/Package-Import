package main;

import com.animal.Dog;
import com.aquatic.Fish;
import com.birds.Sparrow;

public class Main {
	
	
	public static void main(String args[]) {
		Dog in1 = new Dog();
		Fish in2 = new Fish();
		Sparrow in3 = new Sparrow();
		
		// by importing all the information i am able to access the classes from the packages
		
		in1.info1();
		in2.info2();
		in3.fly();
	}
	
	
	
	

}
