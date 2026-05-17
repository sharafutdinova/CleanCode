package stringLiveCoding;

public class IsPalindrome {
  public static boolean isPalindrome(String str) {
    if (str == null || str.isEmpty()) {
      throw new IllegalArgumentException("Строка не может быть пустой");
    }
    String cleanStr = str.toLowerCase().replaceAll("\\s+", "");
    return  cleanStr.contentEquals(new StringBuilder().append(cleanStr).reverse());
  }

  static void main(String[] args) {
    System.out.println(isPalindrome("a"));
    System.out.println(isPalindrome("ab"));
    System.out.println(isPalindrome("aaA"));
    System.out.println(isPalindrome("a  a A"));
    System.out.println(isPalindrome(" "));
    System.out.println(isPalindrome(""));
  }
}
