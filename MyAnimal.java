package animais;

public abstract class MyAnimal implements animal {
	private int age;
	private int higth;
	private int colour;
	
// constructor for an animal
public MyAnimal (int age, int higth, int colour) {
	this.age=age;
	this.higth=higth;
	this.colour=colour;
}


//getter for the private variables (age and higth of the animal)
public int getAge(){
	return age;
}
public int getHigth() {
	return higth;
}
public int getColour() {
	return colour;
}

//prints the information of the animal
public void printInformation() {
	System.out.printf("%d. \nIt is %d years old and has a higth of %d cm. \nThe sound it makes is ", colour, age, higth);
}

}
