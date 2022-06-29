package com.example.cirleci_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CirleciTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CirleciTestApplication.class, args);
        int a = 1;
        int b = 2;


        System.out.println(sumNumbers(a, b));


    }
    public static int sumNumbers(int a, int b){
        return a+b;
    }

}
