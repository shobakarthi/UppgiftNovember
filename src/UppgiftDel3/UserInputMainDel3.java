package UppgiftDel3;

import java.util.Scanner;

// MAIN CLASS
public class UserInputMainDel3 {
public static void main(String[] args) {
    UserInputLogicDel3 logic = new UserInputLogicDel3();
    System.out.println("Enter some text (enter 'stop' to stop the program) : ");
    Scanner scanner = new Scanner(System.in);
    String inputText = "";
    while (!(inputText.equalsIgnoreCase("stop") ||
            inputText.contains(" stop") ||
            inputText.contains("stop ") ||
            inputText.contains(" stop ")))  {
        inputText = scanner.nextLine().toLowerCase();
        logic.userInput(inputText);
    }
    System.out.println("Line count(excluding line which has 'stop') : " + logic.getLineCount());
    System.out.println("Characters count on the text you entered(including space) : " + logic.getCharCount());
    System.out.println("Total Word count: " + logic.getWordCount());
    System.out.println("Longest word that you entered : " + logic.getLongestWord());
    System.out.println("Program Terminated");
}
}
