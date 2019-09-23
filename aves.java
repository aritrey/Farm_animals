package animais;

public abstract class aves extends MyAnimal{
private int egg; 	//how many eggs were laid by one bird
//private int colour; //coulor of the  in RGB color space does

public aves(int egg, int colour, int age, int higth) {
	super(age, higth, colour);
	this.egg=egg;
	//this.colour=colour;
}


//getter for the private variables
public int getEgg() {
	return egg;
}
/*public int getEgg() {
	return egg;
}*/

//prints the information of the animal
	public void printInformation() {
		System.out.printf("It has already laid %d ", egg);
		
		if(egg>1) {System.out.printf("eggs");
		}else {System.out.printf("egg");}
		
		System.out.printf(" and the colour of its feathers is ");
		super.printInformation();
		}

}
