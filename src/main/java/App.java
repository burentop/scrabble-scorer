import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    Scrabble myScrabble = new Scrabble();

    System.out.println("Enter a word, and I will tell you the Scrabble points for it: ");
    String inputWord = myConsole.readLine();

    Integer wordScore = myScrabble.calculateScore(inputWord);
    System.out.println(inputWord + " would score " + wordScore + " points in Scrabble.");
  }
}
