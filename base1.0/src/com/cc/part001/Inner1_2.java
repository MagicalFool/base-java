package com.cc.part001;

public class Inner1_2 {

  class Contents{ }

  class Destination{

    private String label;
    public Destination(String s) {
        this.label = s;
    }

    String getLabel(){
      return label;
    }

  }

  public Destination to (String s){ return new Destination(s);}

  public Contents contents(){ return new Contents();}

  public void ship(String s){
    Contents contents = contents();
    Destination d = to(s);

    System.out.println(d.getLabel());
  }

  public static void main(String[] args) {
    // 如果想从外部类的非静态方法之外的任意位置创建某个内部类的对象，那么必须像在main方法中一样，具体知名这个对象的类型，OutClass.innerClass
    Inner1_2 inner12 = new Inner1_2();
    inner12.ship("test");
    Inner1_2 q = new Inner1_2();
    Inner1_2.Contents c= q.contents();
    Destination d = q.to("gogogo");
    d.getLabel();
  }
}
