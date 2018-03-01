import java.util.Scanner;

public class GradeAnalyzerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeAnalyzer gradebook = new GradeAnalyzer();
		Scanner type = new Scanner(System.in);
		System.out.println("Please type the grade"
				+ " (press enter to next line, the program will analyze your data when you type Q or q):");
		for (int i = 0; i <= 100; i++) {
			String userInput = type.nextLine();
			if (userInput.equals("Q") || userInput.equals("q")) {
				gradebook.analyzeGrade();
				System.out.print(gradebook.toString());
				break;
			} else {
				double t = Double.parseDouble(userInput);
				gradebook.addGrade(t);			
			}
		}
        System.out.println("\n\nComplete!");
	}

}
