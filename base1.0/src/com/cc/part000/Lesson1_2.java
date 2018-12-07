package com.cc.part000;

public class Lesson1_2 {

  public static void main(String[] args) {
    //for
     for (int i = 10;i <11 ;i++){
       System.out.println("for"+i);
     }
     int [] arr = new int[10];
    // foreach
     for (int i: arr) {
      System.out.println("foreach"+i);
    }
    // while
    int x  =10;
    while (x>0){
      System.out.println("while"+x);
      x--;
    }
    // do while
    do {
      x++;
      System.out.println("dowhile"+x);
    }while (x<10);
  }
}
