package animais;
import java.io.*;

public class Main{
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader;
		int cow=0, duck=0, bat=0, chicken=0, unknown=0;
		try (FileInputStream in = new FileInputStream(args[0])){
			
			reader =new BufferedReader(new InputStreamReader(in));
			
			String readLine;
			do {
			readLine = reader.readLine();
			if(readLine==null) {break;}
			String[] splited = readLine.split("\\s+");
			animal a=null;
			switch(splited[0]) {
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
			if(a!=null) {a.printInformation();}
			}while(readLine!=null);
			System.out.printf("The list has %d cows, %d ducks, %d bats, %d chickens and %d lines of unknown content.", cow, duck,bat,chicken, unknown);
			
		}catch(FileNotFoundException e) {
		System.out.printf("No file found, please try again:) \n");
		}
	}

	
}
