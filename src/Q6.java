public class Q6 {
  public static void main(String[] args) {
    int[] arr = new int[8];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }
    int a = 0;
    for (int i = 0; i < arr.length; i++) {
      a += arr[i];
      arr[i] += a;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
