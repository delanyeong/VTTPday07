package vttp2022.day07;

import java.io.*;
import java.security.SecureRandom;
import java.util.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lambda {
    public static void main(String[] args) {
        ExecutorService thrPool = Executors.newFixedThreadPool(4);
        Random rand = new SecureRandom();
        for (int i = 0 ; i < 10 ; i++) {
            final int x = rand.nextInt(100);
            thrPool.submit (
                () -> {
            System.out.printf(">>> i = %d\n", x);
        });
// x should not be declared again, include final
// x=5;


    }
    System.out.println("all done");
    }
}
