package part03_queue;

public class PriorityQueDemo {

  public static void main(String[] args) {
    NewPriorityQue priorityQue = new NewPriorityQue(13);
    priorityQue.insert(3);
    priorityQue.insert(2);
    priorityQue.insert(4);

    System.out.println(priorityQue.remove());
    System.out.println(priorityQue.remove());
    System.out.println(priorityQue.remove());
  }

}
