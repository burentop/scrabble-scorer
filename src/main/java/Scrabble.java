public class Scrabble {

  public Integer getLetterScore(String letter) {
    letter = letter.toLowerCase();
    if (letter.equals("d") || letter.equals("g")) {
      return 2;
    } else if (letter.equals("b") || letter.equals("c") || letter.equals("m") || letter.equals("p")) {
      return 3;
    } else if (letter.equals("f") || letter.equals("h") || letter.equals("v") || letter.equals("w") || letter.equals("y")) {
      return 4;
    } else if (letter.equals("k")) {
      return 5;
    } else if (letter.equals("j") || letter.equals("x")) {
      return 8;
    } else if (letter.equals("q") || letter.equals("z")) {
      return 10;
    } else {
      return 1;
    }
  }

  public Integer calculateScore(String word) {
    Integer score = 0;
    for (int i = 0; i < word.length(); i++) {
      score += getLetterScore(String.valueOf(word.charAt(i)));
    }
    return score;
  }
}
