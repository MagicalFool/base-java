package com.cc.part001;

/**
 *  excercise 2
 */
public class Inner1_4_exercise2 {
  private String str;

  public Inner1_4_exercise2(String str) {
    this.str = str;
  }

  class Inner{
    public void getString(){
      System.out.println(str);
    }
  }

  public Inner getInner(){
    return new Inner();
  }
  public static void main(String[] args) {
    Inner1_4_exercise2 inner = new Inner1_4_exercise2("good");
    inner.getInner().getString();
   }
}
