public class Scrabble {

  public Integer getLetterScore(String letter) {
    if (letter == "d" || letter == "g") {
      return 2;
    } else {
      return 1;
    }
  }

  public Integer calculateScore(String word) {
    Integer score = getLetterScore(word);
    return score;
  }
}
