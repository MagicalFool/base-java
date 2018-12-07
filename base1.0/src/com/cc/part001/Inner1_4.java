package com.cc.part001;

public class Inner1_4 {

  private Object[] items;

  private int next = 0;

  Inner1_4(int x){
    items = new Object[x];
  }
  public void add(Object obj){
    if (next < items.length)
      items[next++ ] = obj;
  }

  private class  Selector implements Inner1_4_Interface{

    private  int i = 0;
    @Override
    public boolean end() {
      return i == items.length;
    }

    @Override
    public Object current() {
      return items[i];
    }

    @Override
    public void next() {
      if (i<items.length)
        i++;
    }
  }
  public  Selector selector(){
    return new Selector();
  }


  public static void main(String[] args) {
    Inner1_4 inner1_4 = new Inner1_4(10);
    for (int i = 0 ; i<10 ; i++){
      inner1_4.add(new Integer(i));

    }
    Selector selector = inner1_4.selector();
    while (!selector.end()){
      System.out.println(selector.current() );
      selector.next();
    }
  }
}
