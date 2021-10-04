package bridgeLabz;

import java.util.Scanner;

public class MoodAnalyser {
	
	private String userMessage;

	
	
	
	public static String analyseMood(String userMessage) throws MoodAnalysisException{
		
			if(userMessage.contains("I am in Sad mood")) {
				return  "SAD";
			}else if(userMessage.contains("I am in Happy mood")) {
				return "HAPPY";
			}
	
			throw new  MoodAnalysisException("Please enter valid message");
		
	}
	
	@Override
	public String toString() {
		return "MoodAnalyser [userMessage=" + userMessage + "]";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your mood : ");
		String message = scanner.nextLine();
		MoodAnalyser object = new MoodAnalyser();
		try {
			System.out.println("Mood Analysis : " + analyseMood(message));
			
		} catch (MoodAnalysisException e) {
			
			e.printStackTrace();
		}
	}
}
