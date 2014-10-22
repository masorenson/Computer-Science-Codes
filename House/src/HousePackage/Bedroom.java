package HousePackage;
 
public class Bedroom {
	public String bedSize = "";
	public int occupants = 0;
	String setBedSize(String aBedSize){
		bedSize = aBedSize;
		return bedSize;
	}
	int setOccupants(int aOccupants){
		occupants = aOccupants;
		return occupants;
	}
}