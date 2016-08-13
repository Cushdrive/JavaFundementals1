package greetings;

import printing.*;

import java.util.*;

public class HelloWorld {


    public static void main(String[] args) {
        //Now that we're using generics, we have to declare the subtype
        //of the printer when we instantiate it.
        Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true, "MY PRINTER", ColorCartridge.BLUE);

        switch (printer.getCartridge()) {
            case BLUE:
                System.out.println("Blue");
                break;
            case RED:
                System.out.println("Red");
                break;
            case YELLOW:
                System.out.println("Yellow");
                break;
            default:
                System.out.println("None");
                break;

        }
    }
}
