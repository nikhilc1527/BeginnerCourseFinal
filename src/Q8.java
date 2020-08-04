public class Q8 {
  public static void main(String[] args) {
    Q8 obj = new Q8();

    help3[] arr = new help3[6];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = obj.new help3();
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < i; j++) {
        arr[i].f1();
      }
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i].f2());
    }
  }

  class help3 {
    int a;

    public help3() {
      a = 1;
    }

    public void f1() {
      a *= 3;
    }

    public int f2() {
      return a / 2;
    }
  }
}
