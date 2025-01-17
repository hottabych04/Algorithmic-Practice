package com.hottabych04.example;

public class Main {
     public static void main(String[] args) {
          MyQueue obj = new MyQueue();
          obj.push(1);
          obj.push(2);
          obj.push(3);
          obj.push(4);
          obj.push(5);
          int param_2 = obj.peek();
          int param_3 = obj.pop();
          boolean param_4 = obj.empty();
          System.out.println(param_2);
          System.out.println(param_3);
          System.out.println(param_4);
     }
}
