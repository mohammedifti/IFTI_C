package java_home_git_practice2;

import java.util.ArrayList;

public class Lec4ArryList_git_practice2 {
	
	public static void main(String[] args) {
		// Array list= is not fixed we can add , remove in ArrayList
		//Syntax ArrayList<datatype> variable =new ArrayList<datatype>();
		//Store 5 cars in one variable in ArrayList
		
		ArrayList<String> cars=new ArrayList<String> ();
		//add method
		cars.add("BMW");
		cars.add("Nissan");
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("GMC");
		cars.add("Mini");
		cars.add("Mazda");
		//Access the item in ArryaList
		cars.get(6);		
		//Remove an item in ArrayLIst
		//cars.remove(3);	
		//Change BMW to Mini.
		cars.set(5, "Mazda");
		// Clear all data in ArrayList (We do not use clear )
		//cars.clear	
		//Size of ArrayList
	    System.out.println(cars.get(6));
		System.out.println(cars.size());
		
		
		
	}


}
