public class Q4 {
  public static void main(String[] args) {
    int a = 13;
    while (a > 1) {
      System.out.println(a);
      if (a % 2 == 1) {
        a = 3 * a + 1;
      } else {
        a /= 2;
      }
    }
    System.out.println(a);
  }
}
