package com.aim.examples;

public class PassObjectReference {

    public static void main(String[] args) {

        SomeObject someObject = new SomeObject("");

        passObjectReference(someObject);

        System.out.println("\nI wanna be like " + someObject + "!\n");

    }

    // change parameter in passObjectReference()
    public static void passObjectReference(SomeObject someObject) {
        someObject.name = "Mike";
        someObject = new SomeObject("Kyle");
    }

}

class SomeObject {
    String name;

    SomeObject(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}