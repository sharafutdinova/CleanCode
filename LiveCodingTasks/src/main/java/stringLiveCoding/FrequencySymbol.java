package stringLiveCoding;

import java.util.*;

public class FrequencySymbol {
  public static Character findFrequencySymbol(String str) {
    if (str == null || str.isEmpty()) {
      throw new IllegalArgumentException("Строка не может быть пустой");
    }
    HashMap<Character, Integer> map = new HashMap<>();
    for (char c : str.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    return map.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).get().getKey();
  }

  static void main(String[] args) {
    System.out.println(findFrequencySymbol("banana"));
    System.out.println(findFrequencySymbol(" "));
  }
}
