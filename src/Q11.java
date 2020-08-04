import java.util.Arrays;

public class Q11 {
  public static void main(String[] args) {
    int[] a = {4, 3, 2, 1, 0};
    int[] b = new int[a.length];
    Arrays.fill(b, 2);
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < a.length; j++) {
        b[a[j]] += b[a.length - 1 - a[i]];
      }
    }
    for (int i = 0; i < a.length; i++) {
      System.out.println(b[i]);
    }
  }
}
