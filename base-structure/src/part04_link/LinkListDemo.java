package part04_link;

public class LinkListDemo {

  public static void main(String[] args) {
     LinkList linkList = new LinkList();
     linkList.insertFirst(22,2.99);
     linkList.insertFirst(12,3.24);
     linkList.insertFirst(32,3.11);

     linkList.display();
  }
}
