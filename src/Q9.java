public class Q9 {
  public static void main(String[] args) {
    Q9 obj = new Q9();

    help3[] arr = new help3[6];
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        arr[i] = obj.new help3();
      } else {
        arr[i] = obj.new help4();
      }
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

  class help4 extends help3 {
    public help4() {
      a = 5;
    }
    public void f1() {
      a *= 5;
    }
  }
}
