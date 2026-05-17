package stringLiveCoding;

public class CountOfWords {
  public static int countOfWords(String str) {
    if (str == null || str.isEmpty()) {
      throw new IllegalArgumentException("Строка не может быть пустой");
    }
    String cleanStr = str.trim().replaceAll("\\s+", " ");
    return cleanStr.split(" ").length;
  }

  static void main(String[] args) {
    System.out.println(countOfWords("a"));
    System.out.println(countOfWords("a  v   qwqwa "));
  }
}
