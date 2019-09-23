package animais;

public abstract class mamiferos extends MyAnimal{
	private boolean breastfeed;

	public mamiferos(int colour,int age, int higth, boolean breastfeed) {
		super(age, higth, colour);	
		this.breastfeed=breastfeed;
	}
	
	
	//getter and setter for the local variable breastfeed
	public boolean getbreastfeed() {
		return breastfeed;
	}
	public void setBreastfeed(boolean b){
		breastfeed=b;
	}
	
	
	
	public void printInformation() {
		System.out.printf("It is ");
		if(!breastfeed) {System.out.printf("not ");}
		System.out.printf("breastfeeding at the moment. The colour of its fur is ");
		super.printInformation();
	}
}
