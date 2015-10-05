import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// declaration of variables for input and output
		String name, result;

		try {
			// getting input reader's object
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(reader);

			System.out.println("Enter the name");
			// get the input from the user

			name = br.readLine();
			// call to function

			result = getRandomnumber(name);
			// print the result
			System.out.println(result);
		} catch (IOException e) {
			// To catch and print error
			e.printStackTrace();
		}

	}

	// static fuction to generate random number between 6 and 15 and concatenate
	// with input string
	static String getRandomnumber(String name) {
	
		int randomNumber = 0;
		String result;
		Random rand = new Random(); // object for random java class
		randomNumber = rand.nextInt(15) + 6;
		result = name + " " + randomNumber;
		return result;
	}

}
