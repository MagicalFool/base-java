package com.cc.part003;

import java.io.ObjectStreamException;

public class Exception3_1 {

  public static void main(String[] args) {
    // 抛出异常
    try {
      throw new Throwable("aa");
    } catch (Throwable throwable) {
      System.out.println(throwable.getMessage());
    }
  }
}
