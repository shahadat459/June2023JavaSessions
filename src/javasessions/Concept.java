package javasessions;

import java.util.ArrayList;

public class Concept {

	ArrayList<String> empList = new ArrayList<String>();
	public ArrayList<String> getEmpList(String compName) {
		
		if(compName.equalsIgnoreCase("IBM")) {
			empList.add("Vishal");
			empList.add("Rohit");
			empList.add("Hrushi");
		}
		else if(compName.equalsIgnoreCase("MS")) {
			empList.add("Ansar");
			empList.add("Sonu");
			empList.add("Akram");
		}
		else if(compName.equalsIgnoreCase("Google")) {
			empList.add("Gul");
			empList.add("Raza");
			empList.add("Shaan");
		}
		else {
			System.out.println("Please enter right company name  " +compName);
		}
		return empList;
	}
	
	public static void main(String[] args) {
		
		Concept concept = new Concept();
		ArrayList<String> empList = concept.getEmpList("gOoGlE");
		System.out.println(empList);

	}

}
