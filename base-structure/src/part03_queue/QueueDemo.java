package part03_queue;

/**
 * 测试自己的队列
 */
public class QueueDemo {

  public static void main(String[] args) {
    NewQueue<String> queue = new NewQueue<>(3);

    queue.insert("a");
    queue.insert("b");
    queue.insert("c");

//    System.out.println(queue.remove());
//    System.out.println(queue.remove());
//    System.out.println(queue.remove());

    while (!queue.isEmpty()){
      System.out.println(queue.remove());
    }
  }
}
