package part01_array;

// array
public interface IArray<T>{

  // 初始化
  void init(int size);

  // 插入元素
  void insert(T t);

  // 添加元素
  void add(T t);

  // 删除元素
  void delete(int index);

  // 更新
  void update(T oldElem, T newElem);

  // 查找
  int find(T t);

}
