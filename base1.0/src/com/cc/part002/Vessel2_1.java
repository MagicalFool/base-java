package com.cc.part002;

import java.util.ArrayList;

/**
 *  如果一个程序只包含固定数量且其生命周期都是已知的对象，那么这是一个非常简单的程序
 */
public class Vessel2_1 {

  public static void main(String[] args) {
    ArrayList apples = new ArrayList();
    for (int i= 3; i>0; i--){
      apples.add(new Apple());
    }
    apples.add(new Orange());
    for (int j = 0; j<apples.size(); j++){
      ((Apple)apples.get(j)).id();
    }
  }

}

class Apple{
  private static long counter;
  private final long id = counter++;
  public long id(){return id;}
}

class Orange{}
