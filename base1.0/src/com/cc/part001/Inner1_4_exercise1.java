package com.cc.part001;

import com.cc.part001.Inner1_4.Selector;

public class Inner1_4_exercise1 {

  private String  str;

  public Inner1_4_exercise1(String str) {
    this.str = str;
  }

  @Override
  public String toString() {
    return str;
  }

  public static void main(String[] args) {
    Inner1_4 inner1_4 = new Inner1_4(10);
    for (int i = 0 ; i<10 ; i++){
      inner1_4.add(new Inner1_4_exercise1("ss"+i));
    }
    Selector selector = inner1_4.selector();

    // 迭代器
    while (!selector.end()){
      System.out.println(selector.current().toString());
      selector.next();
    }

  }
}
