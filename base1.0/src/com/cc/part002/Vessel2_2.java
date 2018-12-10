package com.cc.part002;

import java.util.ArrayList;

public class Vessel2_2 {

  public int gerbilNumber;

  public Vessel2_2(int gerbilNumber) {
    this.gerbilNumber = gerbilNumber;
  }

  public void hop(){
    System.out.println("袋鼠"+gerbilNumber+"在跳跃！！！");
  }

  public static void main(String[] args) {
    ArrayList<Vessel2_2> gerbils = new ArrayList<>();
    gerbils.add(new Vessel2_2(1));
    gerbils.add(new Vessel2_2(2));
    gerbils.add(new Vessel2_2(3));
    gerbils.add(new Vessel2_2(11));
    gerbils.add(new Vessel2_2(2));
    for (int i = 0; i< gerbils.size(); i++){
      gerbils.get(i).hop();
    }
  }
}
