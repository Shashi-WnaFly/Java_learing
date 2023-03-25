package com.Practice;

enum Restaurant{
    dominos, pizzahut, kfc, hamburger, biryani
}
public class Enum2 {
    public static void main(String[] args) {
        Restaurant har;
        har = Restaurant.dominos;

        switch (har) {
            case biryani ->
                System.out.println("Today's item is " + har.biryani);

            case pizzahut ->
                System.out.println("Today's item is " + har.pizzahut);

            case dominos ->
                System.out.println("Today's item is " + har.dominos);

            case kfc ->
                System.out.println("Today's item is " + har.kfc);

            case hamburger ->
                System.out.println("Today's item is " + har.hamburger);

            default->
                System.out.println("something went wrong.");

        }
    }
}
