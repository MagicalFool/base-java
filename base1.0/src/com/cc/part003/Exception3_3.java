package com.cc.part003;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Exception3_3 {



  public static void main(String[] args) {
    try {
      throw new Exception3_3().new MyException();
    } catch (MyException e) {
      System.err.println("Cause"+e);
    }
  }

  class MyException extends Exception{
    private Logger log = Logger.getLogger("MyException");

    public MyException() {
      StringWriter sw = new StringWriter();
      printStackTrace(new PrintWriter(sw));
      log.severe(sw.toString());
    }
  }
}
