package stringLiveCoding;

public class CompressString {
  public static String compressString(String str) {
    if (str == null || str.isEmpty()) {
      throw new IllegalArgumentException("Строка не может быть пустой");
    }
    StringBuilder sb = new StringBuilder();
    int count = 1;
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == str.charAt(i - 1)) {
        count++;
      } else {
        sb.append(str.charAt(i - 1)).append(count);
        count = 1;
      }
    }
    sb.append(str.charAt(str.length() - 1)).append(count);
    String result = sb.toString();
    return result.length() >= str.length() ? str : result;
  }

  static void main(String[] args) {
    System.out.println(compressString("bbaaaananaaa"));
    System.out.println(compressString("banana"));
    System.out.println(compressString("aabcccccaaa"));
    System.out.println(compressString("aabb"));
  }
}
