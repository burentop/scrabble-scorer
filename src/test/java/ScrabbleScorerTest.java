import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleScorerTest {

  @Test
  public void calculateScore_returnScoreForSingleLetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }

  @Test
  public void calculateScore_returnLookedUpScoreForLetter_2() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 2;
    assertEquals(expected, testScrabble.calculateScore("d"));
  }

  @Test
  public void calculateScore_returnLookedUpScoreForLetter_3() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 3;
    assertEquals(expected, testScrabble.calculateScore("b"));
  }

  @Test
  public void calculateScore_returnLookedUpScoreForLetter_4() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 4;
    assertEquals(expected, testScrabble.calculateScore("f"));
  }

  @Test
  public void calculateScore_returnLookedUpScoreForLetter_5() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 5;
    assertEquals(expected, testScrabble.calculateScore("k"));
  }

  @Test
  public void calculateScore_returnLookedUpScoreForLetter_8() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 8;
    assertEquals(expected, testScrabble.calculateScore("j"));
  }

  @Test
  public void calculateScore_returnLookedUpScoreForLetter_10() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 10;
    assertEquals(expected, testScrabble.calculateScore("q"));
  }

  @Test
  public void calculateScore_returnLetterScoreRegardlessOfCase_10() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 10;
    assertEquals(expected, testScrabble.calculateScore("Q"));
  }

  @Test
  public void calculateScore_returnScoreForWord_5() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 5;
    assertEquals(expected, testScrabble.calculateScore("Cat"));
  }
}
