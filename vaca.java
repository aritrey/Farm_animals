package animais;

public class vaca extends mamiferos {

	public vaca(int colour,int age, int higth, boolean breastfeed) {
		super(colour, age, higth, breastfeed);
	}

	
	public void printInformation() {
		System.out.printf("This animal is a cow. \n");
		super.printInformation();
		System.out.printf("mooing.\n\n");
	}
	
	public Som getSound() {
		return Som.mugido;
	}
	
	
}
