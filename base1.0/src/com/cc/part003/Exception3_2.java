package com.cc.part003;

public class Exception3_2 extends Exception{

  public Exception3_2(String message) {
    super(message);
  }

  public static void main(String[] args) {
    try {
      throw new Exception3_2("aaa");
    } catch (Exception3_2 e) {
      System.out.println(e.getMessage());
      return;
    }finally {
      System.out.println("finally");
    }
  }
}
