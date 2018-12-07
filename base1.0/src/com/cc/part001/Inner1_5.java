package com.cc.part001;

/**
 * 使用.this 和 .new
 */
public class Inner1_5 {
  void f() {
    System.out.println("out function");
  }
  public class Inner{
    public Inner1_5 dothis(){
      return Inner1_5.this;
    }
  }

  public Inner inner(){return  new Inner();}

  public static void main(String[] args) {
    Inner1_5 in = new Inner1_5();
    Inner inner = in.inner();

    // .new 
    Inner inner1 = in.new Inner();
  }
}
