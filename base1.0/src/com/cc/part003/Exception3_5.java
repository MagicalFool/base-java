package com.cc.part003;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Exception3_5 {
  private static Logger log = Logger.getLogger("MyException");

  public static void main(String[] args) {
    int[] arr = new int[2];
    try {
      System.out.println(arr[3]);
    }catch (Exception e){
      StringWriter sw = new StringWriter();
      e.printStackTrace(new PrintWriter(sw));
      log.severe(sw.toString());
    }
  }
}