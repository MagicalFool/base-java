package com.cc.part001;

/**
 *  创建内部类
 */
public class Inner1_1 {

  static class C1{
    private int i = 0 ;
    public int value(){
      return i;
    }
  }

  // 内部类无法继承本类中内部类
  static class C2 extends Object{
    static private int j = 1;

    public int getJ() {
      return j;
    }
  }
  public static void main(String[] args) {
    System.out.println(C2.j+""+new C1().value());
  }
}
