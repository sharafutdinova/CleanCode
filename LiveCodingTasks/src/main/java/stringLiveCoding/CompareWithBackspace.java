package stringLiveCoding;

public class CompareWithBackspace {
  public static boolean compareWithBackspace(String str1, String str2) {
    if (str1 == null || str1.isEmpty() || str2 == null || str2.isEmpty()) {
      throw new IllegalArgumentException("Строка не может быть пустой");
    }
    return deleteSymbols(str1).equals(deleteSymbols(str2));
  }

  public static String deleteSymbols(String str) {
    if (!str.contains("#")) return str;
    StringBuilder sb = new StringBuilder();
    sb.append(str);
    while (sb.indexOf("#") >= 0) {
      int index = sb.indexOf("#");
      sb.delete(index - 1, index + 1);
    }
    return sb.toString();
  }

  static void main(String[] args) {
    System.out.println(compareWithBackspace("ab#c", "ad#c"));
    System.out.println(compareWithBackspace("a", "ac#"));
    System.out.println(compareWithBackspace("ca#", "ac#"));
  }
}
