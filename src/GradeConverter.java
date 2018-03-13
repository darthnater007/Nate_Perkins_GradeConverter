import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args) {
		System.out.println("Welcome to the Grade Converter. \n\n");
		
		Scanner sc = new Scanner(System.in);
		int score;
		String grade= "none";
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) 
		{
			System.out.print("Enter your score: ");
			score=sc.nextInt();
			if (score > 100) {
				grade = "Invalid Score";}
			if (score <= 100) {
				grade = "A";}
			if (score < 88) {
				grade = "B";}
			if (score < 80) {
				grade = "C";}
			if (score < 68){
				grade = "D";}
			if (score < 60){
				grade = "F";}
			System.out.println("Grade: "+ grade + "\n");
			while (!choice.equalsIgnoreCase("N")) {
			System.out.println("Continue? y/n:");
			choice = sc.next();
			if (choice.equalsIgnoreCase("Y")) {
				break;
			}
			}
			}
		sc.close();
		System.out.println("Bye!");
		}
	}
