package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly obj=new RWOnly();
    obj.setter("Priyank");
    String str=obj.getter();
    System.out.println(str);
  }
}
