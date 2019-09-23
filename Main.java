package animais;
import java.io.*;

public class Main{
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader;						//creates a BufferedReader
		int cow=0, duck=0, bat=0, chicken=0, unknown=0;  		//Count the number of animals
		try (FileInputStream in = new FileInputStream(args[0])){	//tests if there is a textfile
			
			reader =new BufferedReader(new InputStreamReader(in));
			
			String readLine;
			do {
			readLine = reader.readLine();				//reads one line
			if(readLine==null) {break;}				//no line left-> end of file
			String[] splited = readLine.split("\\s+");		//split the string at the spaces
			animal a=null;
			switch(splited[0]) {					//tests what animal it is and creates a new instance of this animal
			case "cow":a= new vaca (Integer.valueOf(splited[1]),Integer.valueOf(splited[2]),Integer.valueOf(splited[3]),Boolean.valueOf(splited[4])); 
						cow++; break;
			case "duck":a= new pato(Integer.valueOf(splited[1]),Integer.valueOf(splited[2]),Integer.valueOf(splited[3]),Integer.valueOf(splited[4]),Integer.valueOf(splited[5]));
						duck++; break;
			case "bat":a= new Morcego(Integer.valueOf(splited[1]),Integer.valueOf(splited[2]),Integer.valueOf(splited[3]),Integer.valueOf(splited[4]),Boolean.valueOf(splited[5]));
						bat++; break;
			case "chicken":a= new Galinha (Integer.valueOf(splited[1]),Integer.valueOf(splited[2]),Integer.valueOf(splited[3]),Integer.valueOf(splited[4])); 
						chicken++; break;
			default: unknown++;
			}
			if(a!=null) {a.printInformation();}			//print information about the animal (in the console)
			}while(readLine!=null);
			System.out.printf("The list has %d cows, %d ducks, %d bats, %d chickens and %d lines of unknown content.", cow, duck,bat,chicken, unknown);
			
		}catch(FileNotFoundException e) {
		System.out.printf("No file found, please try again:) \n");	//no file found
		}
	}

	
}
