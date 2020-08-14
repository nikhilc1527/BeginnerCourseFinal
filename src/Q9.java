public class Q9 {
  public static void main(String[] args) {
    Q9 obj = new Q9();

    MyClass1[] arr = new MyClass1[6];
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        arr[i] = obj.new MyClass1();
      } else {
        arr[i] = obj.new MyClass2();
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

  class MyClass1 {
    int a;
    public MyClass1() {
      a = 1;
    }
    public void f1() {
      a *= 3;
    }
    public int f2() {
      return a / 2;
    }
  }

  class MyClass2 extends MyClass1 {
    public MyClass2() {
      a = 5;
    }
    public void f1() {
      a *= 5;
    }
  }
}
