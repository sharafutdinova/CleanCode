package stringLiveCoding;

import java.util.HashMap;

public class CanGetPalindrome {
  public static boolean canBePalindrome(String str) {
    if (str == null || str.isEmpty()) {
      throw new IllegalArgumentException("Строка не может быть пустой");
    }
    HashMap<Character, Integer> map = new HashMap<>();
    for (char c : str.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    long countOfEven = map.values().stream().map(count -> count % 2 == 0).filter(value -> !value).count();
    return countOfEven <= 1;
  }

  static void main(String[] args) {
    System.out.println(canBePalindrome("banana"));
    System.out.println(canBePalindrome("ivicc"));
    System.out.println(canBePalindrome("civic"));
  }
}
