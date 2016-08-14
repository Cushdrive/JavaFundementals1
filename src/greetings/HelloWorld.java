package greetings;

import printing.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HelloWorld {


    public static void main(String[] args) {
        ContinuousPrinter cp = new ContinuousPrinter();
//        Thread thread = new Thread(cp);
//        thread.start();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(cp);
        executor.submit(cp);
        executor.submit(cp);
        executor.submit(cp);
        executor.submit(cp);
        executor.submit(cp);
        executor.shutdown();

        for (int i = 0; i < 100; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
