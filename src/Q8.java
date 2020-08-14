public class Q8 {
  public static void main(String[] args) {
    Q8 obj = new Q8();

    MyClass[] arr = new MyClass[6];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = obj.new MyClass();
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

  class MyClass {
    int a;

    public MyClass() {
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
