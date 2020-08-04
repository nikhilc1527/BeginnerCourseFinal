public class Q5 {
  public static void main(String[] args) {
    Q5 obj = new Q5();

    int a = 10;
    int b = 5;
    int c = obj.f1(a, b);

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }

  int f1(int a, int b) {
    int c = a;
    a = b;
    b = c;
    return c;
  }
}
