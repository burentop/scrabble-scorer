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
}
