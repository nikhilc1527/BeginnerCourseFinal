public class Q7 {
  public static void main(String[] args) {
    Q7 obj = new Q7();

    int[] arr = new int[5];
    int a = 1;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr.length - i - 1;
    }
    for (int i = 0; i < arr.length; i++) {
      a *= arr[i];
      arr[i] = obj.help2(a);
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
  int help2(int a) {
    a *= 2;
    return a;
  }
}
