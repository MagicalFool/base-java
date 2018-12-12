package com.cc.part004;

import java.io.File;
import java.io.IOException;

public class File4_1 {

  // 临时文件删除
  public static void main(String[] args) {
    File f = null;
    try {
      f = File.createTempFile("1111111111111111111aaa", ".txt");
      System.out.println(f.exists());
      f.deleteOnExit();
      System.out.println(f.getTotalSpace());
      f.delete();
      System.out.println(f.getTotalSpace());
      return;
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      System.out.println(f.exists());
    }
  }
}
