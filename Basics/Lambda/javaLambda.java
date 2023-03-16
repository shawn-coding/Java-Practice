package Basics.Lambda;

import java.util.ArrayList;

public class javaLambda {
    //This project will focus on lambda expressions.
    //And, because they are linked with lists, some ArrayList practice.
    public static void main(String[] args){
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(4);
        intList.add(27);
        intList.add(6);
        intList.add(8);
        intList.add(3);
        intList.add(5);
        System.out.println("We have a list of integers  here:");
        intList.forEach(n -> System.out.println(n));
        System.out.println("But we only want the odd ones! Let's change that!");
        intList.removeIf(num -> num % 2 == 0);
        System.out.println("List changed. Let's see what prints out now!:");
        intList.forEach(n -> System.out.println(n));
    }
        /*
         * For the next process, I'd like to work on objects with methods.
         * Then I could do some things like:
         * Bird sparrow = new Bird();
         * sparrow ->sparrow.canFly();
         * I think it would help out with just pushing all that into smaller
         * bits, but I'll also have to research to see performance of it
         * vs a method call of something small like above, checking if even.
         */
}
