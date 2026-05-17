package stringLiveCoding;

public class FirstUnique {
  public static int findFirstUnique(String str) {
    if (str == null || str.isEmpty()) {
      throw new IllegalArgumentException("Строка не может быть пустой");
    }
    if (str.length() == 1) {return 0;}
    for (int i = 0; i < str.length(); i++) {
      int firstInd = str.indexOf(str.charAt(i));
      int lastInd = str.lastIndexOf(str.charAt(i));
      if (firstInd == lastInd) return i;
    }
    return -1;
  }

  static void main(String[] args) {
    System.out.println(findFirstUnique("a"));
    System.out.println(findFirstUnique("asa"));
    System.out.println(findFirstUnique("aaaav"));
    System.out.println(findFirstUnique("aarqqarvv"));
    System.out.println(findFirstUnique(""));
  }
}
