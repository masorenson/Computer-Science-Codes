package HousePackage;

public class House {
	public static void main(String[] args)
	{
 
 
		Bathroom bathroom1 = new Bathroom();
			bathroom1.setToilet(true);
			bathroom1.setShower(true);
			bathroom1.setBath(false);
			bathroom1.setSink(true);
		System.out.println("Bathroom:\nToilet = " + bathroom1.toilet + "\nShower = " + bathroom1.shower + "\nBath = " + bathroom1.bath + "\nSink = " + bathroom1.sink);
		System.out.println("");
 
 
		Bedroom bedroom1 = new Bedroom();
			bedroom1.setBedSize("King");
			bedroom1.setOccupants(2);
		System.out.println("Bedrooms:\nThe first bedroom has a " + bedroom1.bedSize + " sized bed and " + bedroom1.occupants + " occupant(s)");
		Bedroom bedroom2 = new Bedroom();
			bedroom2.setBedSize("Twin");
			bedroom2.setOccupants(1);
		System.out.println("The second bedroom has a " + bedroom2.bedSize + " sized bed and " + bedroom2.occupants + " occupant(s)");
		System.out.println("");
 
 
		Person person1 = new Person();
			person1.setName("Bob");
			person1.setFamilyRole("Father");
		Person person2 = new Person();
			person2.setName("Jill");
			person2.setFamilyRole("Mother");
		Person person3 = new Person();
			person3.setName("June");
			person3.setFamilyRole("Daughter");
		System.out.println("Family:\n" + person1.name + " is the " + person1.familyRole + ", " + person2.name + " is the " + person2.familyRole + ", and " + person3.name + " is the " + person3.familyRole + ".");
	}
}