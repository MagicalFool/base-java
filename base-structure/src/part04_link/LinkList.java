package part04_link;

public class LinkList {

  private NewLink first;

  public LinkList() {
    first = null;
  }

  public boolean isEmpty() {
    return (first == null);
  }

  public void insertFirst(int id, double dd) {
    NewLink newLink = new NewLink(id, dd);
    newLink.next = first;
    first = newLink;
  }

  public NewLink deleteFirst() {
    NewLink temp = first;
    first = first.next;
    return temp;
  }

  public void display(){
    System.out.println("List(first->last):");
    NewLink current = first;
    while (current != null){
      current.displayNode();
      current = current.next;
    }
    System.out.println("");
  }
}
