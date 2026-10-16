public class MutiplyOfElements {
  public static void main(String[] args) {
    int result = multiply(5, 10);
    System.out.println("Multiplication results: " + result);
  }

  private static int multiply(int i, int j) {
    int temp = 0;
    int k = 1;

    while (k <= j) {
      temp = temp + i;
      k++;
    }

    return temp;
  }
}
