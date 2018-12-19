package part01_array;

public class NewArray implements IArray<Long> {

  private Long[] array;

  private int length;

  @Override
  public void init(int size) {
    array = new Long[size];
    length = 0;
  }

  @Override
  public void insert(Long aLong) {

  }

  @Override
  public void add(Long aLong) {
    this.array[length++] = aLong;
  }

  @Override
  public void delete(int index) {
    if (index > length)
      return;
    for (int i = index; i < length - 1; i++) {
      array[index] = array[index + 1];
    }
  }

  @Override
  public void update(Long oldElem, Long newElem) {

  }

  @Override
  public int find(Long aLong) {
    for (int i = 0; i < length; i++) {
      if (array[i] == aLong) {
        return i;
      }
    }
    return -1;
  }
}
