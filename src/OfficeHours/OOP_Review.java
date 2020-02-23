package OfficeHours;

public class OOP_Review {
    /*
    OOP: Encapsulation, inheritance, abstraction, polimorphism

   Encapsulation:
   Data hiding


   make the field private
   provide access using getters & setters

    benefits:
    Security purpose(Protect our Data)
    We can control what we put inside the field
    easier to maintain (it helps us to avoid some errors in the code)

    ex:
    We have object where one of the fields
    can be only negative  int value

    We directly assigned the negative value
    we used this object in several places in our project

    result: We will have a brunch of errors across the project something is not working

    to handle this we make this field private & we check the value we want to
    assign directly in setter method


    if we try to assign value to the private field, we get compiler error

    Constructor:
    constructor will be called every time, we Create an object using 'new' keyword
    plays the role of initializing an object (instance variable)


    requirements:
    -Same name as class name
    -can be with params or without
    -no Return type
    - can be overloaded
    -

    ex:
    String class:

    String word = new String("Lemon");

    if we don't declare any constructor in class?
    -We are getting no-args constructor w/ empty body by default

    I we provide constructors w/ parameters(params) will we get the one by default ?
    NOO

     */
}
