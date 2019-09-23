package animais;

public class Galinha extends aves {
	
	public Galinha(int egg, int colour, int age, int higth) {
		super(egg, colour, age, higth);
	}

//prints the information of the animal
	public void printInformation() {
		System.out.print("This animal is a chicken. \n");
		super.printInformation();
		System.out.printf("cackle.\n\n");
		}
	
	public Som getSound() {
		return Som.cacarejo;
	}
}
