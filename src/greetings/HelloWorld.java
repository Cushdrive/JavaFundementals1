package greetings;

import printing.Machine;
import printing.Printer;
import printing.iMachine;

public class HelloWorld {


    public static void main(String[] args)
    {
        iMachine machine = new Printer(true,"MY PRINTER");

        machine.TurnOn();

    }

}
