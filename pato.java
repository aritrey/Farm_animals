package animais;

public class pato extends aves{
	private int higthFlight;
	
	public pato(int egg, int colour, int higthFlight,int age, int higth){
		super(egg, colour, age, higth);
		this.higthFlight=higthFlight;
	}
	
	//prints the information of the animal
	public void printInformation() {
		System.out.printf("This animal is a duck. \nThe hight of its flight is %d m. \n", higthFlight);
		super.printInformation();
		System.out.printf("quack.\n\n");
	}
	
	public Som getSound() {
		return Som.grasnido;
	}
}
