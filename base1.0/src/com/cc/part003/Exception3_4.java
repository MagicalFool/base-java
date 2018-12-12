package com.cc.part003;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Exception3_4 {

  public static void main(String[] args) {
    try {
      throw new AException();
    } catch (AException e) {
      try {
        throw new BException();
      } catch (BException e1) {
        try {
          throw new AException();
        } catch (AException e2) {
          e2.printStackTrace();
        }
      }
    }
  }
}

class AException extends Exception{
  private Logger log = Logger.getLogger("AException");
  public AException() {
    StringWriter sw = new StringWriter();
    printStackTrace(new PrintWriter(sw));
    log.severe(sw.toString());
  }

  public AException(String message) {
    super(message);
  }
}

class BException extends Exception{
  private Logger log = Logger.getLogger("BException");
  public BException() {
    StringWriter sw = new StringWriter();
    printStackTrace(new PrintWriter(sw));
    log.severe(sw.toString());
  }

  public BException(String message) {
    super(message);
  }
}
