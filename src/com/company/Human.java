package com.company;

public class Human
{
    public Human(){}

    private Head head;
    public Head getHead() {
        return head;
    }
    public void setHead(Head head) {
        this.head = head;
    }

    private Leg leg;
    public Leg getLeg() {
        return leg;
    }
    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    private Hand hand;
    public Hand getHand() {
        return hand;
    }
    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void setInfo(Head head, Leg leg, Hand hand)
    {
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public class Head
    {
        public Head(){}
        private int numberOfTeeth;
        public void setNumberOfTeeth(int numberOfTeeth)
        {
            this.numberOfTeeth = numberOfTeeth;
        }
        public int getNumberOfTeeth()
        {
            return numberOfTeeth;
        }
    }

    class Leg
    {
        public  Leg(){}
        private int numberOfFingers;
        public int getNumberOfFingers()
        {
            return numberOfFingers;
        }
        public void setNumberOfFingers(int numberOfFingers)
        {
            this.numberOfFingers = numberOfFingers;
        }
    }

    class Hand
    {
        public Hand(){}
        private int numberOfHand;
        public int getNumberOfHand()
        {
            return numberOfHand;
        }
        public void setNumberOfHand(int numberOfHand)
        {
            this.numberOfHand = numberOfHand;
        }
    }
}

