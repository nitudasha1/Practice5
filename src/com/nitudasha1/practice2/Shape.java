package com.nitudasha1.practice2;

public class Shape {
    public String size="small";
    public String form="triangle";
    public void Information(){
        System.out.println(size+"  "+form);
    }
}
class TestShape{
    public static void main(String[] args) {
        Shape t = new Shape();
        t.Information();
    }
}