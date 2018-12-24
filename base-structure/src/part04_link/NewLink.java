package part04_link;

/**
 * 单链表
 */
public class NewLink {

  public int iData;
  public double dData;
  public NewLink next;

  public NewLink(int iData, double dData) {
    this.iData = iData;
    this.dData = dData;
  }

  public void displayNode() {
    System.out.println("{" + iData + "," + dData + "}");
  }
}
