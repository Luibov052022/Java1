public class Main {

  public static void main(String[] args) {
    int array[] = { 12, 2, 5, 1, 16, 3, 2, 4 };
    int len = array.length;
    HeapSorting s = new HeapSorting();
    s.sort(array);
    for (int i = 0; i < len; i++) {
      System.out.print(array[i] + " ");
    }
  }
}

class HeapSorting {

  public void sort(int[] array) {
    int len = array.length;
    for (int i = len / 2 - 1; i > +0; i--) {
      maxInTie(array, len, i);
    }
  }

  void maxInTie(int[] array, int len, int tie) {
    int maxTie = tie;

    for (int i = 2 * tie + 1; i <= 2 * tie + 2; i++) {
      if (i < len && array[i] > array[maxTie]) {
        maxTie = i;
      }
    }
    if (maxTie != tie) {
      int temp = array[tie];
      array[tie] = array[maxTie];
      array[maxTie] = temp;
      maxInTie(array, len, maxTie);
    }
  }
}
