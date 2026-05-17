package stringLiveCoding;

public class ReverseWords {
  public static String reverseWords(String str) {
    if (str == null || str.isEmpty()) {
      throw new IllegalArgumentException("Строка не может быть пустой");
    }
    String[] cleanStr = str.trim().replaceAll("\\s+", " ").split(" ");
    StringBuilder builder = new StringBuilder();
    for (int i = cleanStr.length - 1; i >= 0; i--) {
      builder.append(cleanStr[i]);
      builder.append(" ");
    }
    return builder.deleteCharAt(builder.length() - 1).toString();
  }

  static void main(String[] args) {
    System.out.println(reverseWords("a  v   qwqwa "));
    System.out.println(reverseWords("Test"));
    System.out.println(reverseWords("qwe qwe "));
    System.out.println(reverseWords(""));
  }
}
