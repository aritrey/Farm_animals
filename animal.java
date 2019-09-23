package animais;

public interface animal {

enum Som {grasnido, cacarejo, mugido, farfalho;}

//getter for age, higth and sound
public int getAge();

public int getHigth();

public Som getSound();

public int getColour();

//prints the information of the animal
public void printInformation();

}
