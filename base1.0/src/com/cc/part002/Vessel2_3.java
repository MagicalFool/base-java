package com.cc.part002;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Vessel2_3 {

  public static void main(String[] args) {
    Collection<Integer> c = new ArrayList<>();
    System.out.println(c.hashCode());
    c = new HashSet<>();
    System.out.println(c.hashCode());
    c.add(1);
    c.add(new Integer(1));
    c.add(2);
    c.add(3);
    System.out.println(c.size());
  }
}
