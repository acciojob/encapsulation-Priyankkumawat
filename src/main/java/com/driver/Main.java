package com.driver;

public class Main {
  RWOnly obj=new RWOnly();
  obj.setter("Priyank");
  String str=obj.getter();
  System.out.println(str);
}
