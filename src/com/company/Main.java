package com.company;


public class Main {

    public static void main(String[] args) {

        Human h = new Human();
        Human.Head t = h.new Head();
        Human.Leg l = h.new Leg();
        Human.Hand he = h.new Hand();

        //var t = new Human.Head();
        t.setNumberOfTeeth(32);
        l.setNumberOfFingers(10);
        he.setNumberOfHand(2);

        h.setInfo(t,l,he);

        System.out.println("Кол-во зубов " + h.getHead().getNumberOfTeeth());
        System.out.println("Кол-во пальцев " + h.getLeg().getNumberOfFingers());
        System.out.println("Кол-во рук " + h.getHand().getNumberOfHand());

    }
}
