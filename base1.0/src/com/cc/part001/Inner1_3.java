package com.cc.part001;

public class Inner1_3 {
  class  Inner{
    public void play(){
      System.out.println("play a time");
    }
  }

  public Inner InnerClass(){
    return new Inner();
  }

  public static void main(String[] args) {
    Inner inner = new Inner1_3().InnerClass();
    inner.play();
  }
}
