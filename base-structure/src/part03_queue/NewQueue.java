package part03_queue;

public class NewQueue<T> {

  private int maxSize; // 队列最大长度

  private T[] queueArray; // 数据存储数组

  private int front; // 队首

  private int rear; // 队尾

  private int nItems; // 当前容量

  public NewQueue(int maxSize) {
    queueArray = (T[]) new Object[maxSize];
    front = 0;
    rear = -1;
    nItems = 0;
  }

  public void insert(T t) {
    if (rear == maxSize - 1) {
      rear = -1;
    }
    queueArray[++rear] = t;
    nItems++;
  }

  public T remove() {
    T temp = queueArray[front++];
    if (front == maxSize) {
      front = 0;
    }
    nItems--;
    return temp;
  }

  /**
   * 获取队首元素
   */
  public T peekFront() {
    return queueArray[front];
  }

  /**
   * 获取队尾元素
   */
  public T peekRear() {
    return queueArray[rear];
  }

  /**
   * 队空
   * @return
   */
  public boolean isEmpty() {
    return (nItems == 0);
  }

  /**
   * 队满
   * @return
   */
  public boolean isFull() {
    return (nItems == maxSize);
  }

  /**
   * 返回队列实际使用长度
   * @return
   */
  public int size() {
    return nItems;
  }

}
