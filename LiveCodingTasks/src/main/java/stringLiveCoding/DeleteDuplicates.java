package stringLiveCoding;

import java.util.Arrays;
import java.util.List;

public class DeleteDuplicates {
  public static String deleteDuplicates(String str) {
    if (str == null || str.isEmpty()) {
      throw new IllegalArgumentException("Строка не может быть пустой");
    }
    String cleanStr = str.toLowerCase();
    List<String> uniq = Arrays.stream(cleanStr.split("")).distinct().toList();
    StringBuilder sb = new StringBuilder();
    for (String s : uniq) {
      sb.append(s);
    }
    return sb.toString();
  }

  static void main(String[] args) {
    System.out.println(deleteDuplicates("banana"));
    System.out.println(deleteDuplicates("q"));
    System.out.println(deleteDuplicates("one"));
    System.out.println(deleteDuplicates("AAa"));
  }
}
