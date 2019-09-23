package animais;

public class Morcego extends mamiferos {
	private int higthFlight;

	
	public Morcego(int colour, int age, int higth, int higthFlight,boolean breastfeed) {		
		super(colour, age, higth, breastfeed);
		this.higthFlight=higthFlight;
	}
	
	
	public void printInformation() {
		System.out.printf("This animal is a bat. \n The hight of its flight is %d. \n", higthFlight);
		super.printInformation();
		System.out.printf("rustle.\n\n");
	}
	
	public Som getSound() {
		return Som.farfalho;
	}

}
