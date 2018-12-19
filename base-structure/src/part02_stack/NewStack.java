package part02_stack;

public class NewStack {

  private Long[] elements; // 元素

  private int maxSize; // 栈大小

  private int top; // 栈顶指针

  public NewStack(int size) {
    this.elements = new Long[size];
    this.maxSize = size;
    this.top = -1;
  }

  public void push(Long e) {
    elements[++top] = e;
  }

  public long pop() {
    return elements[top--];
  }

  public long peek() {
    return elements[top];
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public boolean isFull() {
    return top == maxSize - 1;
  }
}
