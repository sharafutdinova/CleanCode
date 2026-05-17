package stringLiveCoding;

import java.util.Arrays;

public class isAnagram {
  public static boolean isAnagramma(String str1, String str2) {
    if (str1 == null || str1.isEmpty() || str2 == null || str2.isEmpty()) {
      throw new IllegalArgumentException("Строка не может быть пустой");
    }
    String[] arr1 = Arrays.stream(str1.toLowerCase().split("")).sorted().toArray(String[]::new);
    String[] arr2 = Arrays.stream(str2.toLowerCase().split("")).sorted().toArray(String[]::new);
    return Arrays.equals(arr1, arr2);
  }

  static void main(String[] args) {
    System.out.println(isAnagramma("aa", "a"));
    System.out.println(isAnagramma("abba", "abAB"));
    System.out.println(isAnagramma("", "a"));
  }
}
