package greetings;

import printing.*;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class HelloWorld {


    public static void main(String[] args)
    {
        //Now that we're using generics, we have to declare the subtype
        //of the printer when we instantiate it.
        Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true,"MY PRINTER",new ColorCartridge());
//        Printer<ColorCartridge> printer2 = new Printer<ColorCartridge>(true,"MY PRINTER",new ColorCartridge());

        //The method accepts a generic, so we'll just pass it a color cartridge. We could also
        //pass it a black and white cartridge.
        //printer.printUsingCartridge(new ColorCartridge(),"Generic message.");
        //printOne(printer);

/*        try {
            printer.print(-1);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return;
        }
        finally {
            printer.TurnOff();
        }*/

//        printer.loadPaper(10);
//        printer.print(5);
//        //printer.outputPage(3);
//
//        Set<Integer> mySet = new HashSet<Integer>();
//        mySet.add(1);
//        mySet.add(2);
//        mySet.add(3);
//        System.out.println(mySet.size());
//
//        for (Integer i:mySet) {
//            printer.outputPage(i);
//        }

        Queue<String> myQueue = new LinkedList<String>();
        myQueue.offer("A");
        myQueue.offer("B");
        myQueue.offer("C");

        while(myQueue.peek() != null) {
            System.out.println(myQueue.poll().toString());
        }
    }

/*    private static void printOne(Printer<? extends ICartridge> printer) {
        String fillPercentage = printer.getCartridge().getFillPercentage();
        printer.print(-11);
        System.out.println(fillPercentage);
    }*/

}
