package part03_queue;

/**
 * 优先队列
 */
public class NewPriorityQue {

  private int maxSize;

  private long[] queArray;

  private int anInt;

  public NewPriorityQue(int maxSize) {
    this.maxSize = maxSize;
    queArray = new long[maxSize];
    anInt = 0;
  }

  public void insert(long item) {
    int j;
    if (anInt == 0) {
      queArray[anInt++] = item;
    } else {
      for (j = anInt - 1; j >= 0; j--) {
        if (item > queArray[j]) {
          queArray[j + 1] = queArray[j];
        } else {
          break;
        }
      }
      queArray[j + 1] = item;
      anInt++;
    }
  }

  public long remove() {
    return queArray[--anInt];
  }

  public long peekMin() {
    return queArray[anInt - 1];
  }

  public boolean isEmpty() {
    return anInt == 0;
  }
  public boolean isFull(){
    return anInt == maxSize;
  }
}
