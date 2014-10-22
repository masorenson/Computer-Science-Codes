package HomeworkPackage;

public class Bathroom {
	public boolean toilet = false;
	public boolean shower = false;
	public boolean bath = false;
	public boolean sink = false;
	boolean setToilet(boolean isToilet){
		toilet = isToilet;
		return toilet;
	}
	boolean setShower(boolean isShower){
		shower = isShower;
		return shower;
	}
	boolean setBath(boolean isBath){
		bath = isBath;
		return bath;
	}
	boolean setSink(boolean isSink){
		sink = isSink;
		return sink;
	}
}
