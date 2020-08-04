public class Q10 {
  public static void main(String[] args) {
    char[] a = new char[13];
    for (int i = 0; i < a.length; i++) {
      a[i] = (char)('a' + 2 * i);
    }
    String b = "";
    for (int i = 0; i < a.length; i++) {
      b += a[(i * 2) % a.length] + " ";
    }
    System.out.println(b);
  }
}
