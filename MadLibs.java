import java.util.Scanner;
/*
 * Preconditions: User can give String inputs to program
 * Postconditions: String is printed with necessary replacements
 */
public class MadLibs {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		//Template for the three riddles
		String sentence1 = "Today I went to the zoo. I saw a(n) <adjective> <noun> jumping up and down its tree.";
		String sentence2 = "On <adjective> spring days, <adjective> rabbits hop <adverb> through a meadow near the <adjective> trees.";
		String sentence3 = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";
		
		//Create an array of the three so that a random one can be selected
		String[] sentenceArray = {sentence1, sentence2, sentence3};
		
		//Select a random mad lib
		String finalMadLib = sentenceArray[(int)(Math.random() * 3)];
		
		//Print out the mad lib template
		System.out.println(finalMadLib);
		
		//Until there are no labels in the string
		while(finalMadLib.indexOf('<') != -1)
		{
			int start = finalMadLib.indexOf('<') + 1; // find the first part of a label that needs to be replaced
			int finish = finalMadLib.indexOf('>');    // find the end of the label that needs to be replaced
		
			String askedString = finalMadLib.substring(start, finish); // Gets the name of the label that needs to be replaced
			System.out.println("Give me a big ol " + askedString);     // Creates a prompt for the user
			String result = sc.nextLine();                             // Asks the user for their input
			result = result.replace("<", "").replace(">", "");         // remove '<' and '>' from the string
		
			finalMadLib = finalMadLib.replaceFirst("<" + askedString + ">", result); //Replace the string storing the madlib with the user's input
			System.out.println(finalMadLib); // Print the completed String
		}
	}
}
