package com.nitudasha1.practice3;

public class Human {
    public String name;
    public int weight;
    public Human(int weight){
        this.weight= weight;
        this.name= name;
    }
    public void Out(){
        System.out.println("Name:"+name+"  "+"Weight: "+ weight);
    }
}
class Head extends Human{
    private String shape;
    public Head(int weight,String shape) {
        super(weight);
        this.shape=shape;
    }
    public void Out(){
        System.out.println("Head weight: "+weight+"  "+"Head sape: "+shape);
    }
    static class Leg extends Human{
        public int size;
        public Leg(int weight,int size) {
            super(weight);
            this.size=size;
        }
        public void Out(){
            System.out.println("Leg weight: "+weight+"  "+"Leg size: "+size);
        }
    }
    static class Hand extends Human{
        public int length;
        public Hand(int weight, int length) {
            super(weight);
            this.length = length;
        }
        public void Out(){
            System.out.println("Hand weight: "+ weight+"  "+"Hand length: "+length);
        }

    }
    public static void main(String[] args){
        Human Aurika=new Human(70);
        Aurika.name="Aurika";
        Aurika.Out();
        Head head= new Head(7,"round");
        head.Out();
        Leg leg= new Leg(10,36);
        leg.Out();
        Hand hand=new Hand(5,57);
        hand.Out();
    }
}