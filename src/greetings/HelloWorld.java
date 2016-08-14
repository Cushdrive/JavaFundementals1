package greetings;

import printing.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class HelloWorld {


    public static void main(String[] args) {
        ContinuousPrinter cp = new ContinuousPrinter();
        cp.start();

        ContinuousPrinter cp2 = new ContinuousPrinter();
        cp2.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
