package com.company;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {



        /*//Task #1:
        Scanner in = new Scanner(System.in);
        //System.out.print("Enter your name ");
        String name = in.nextLine();
        System.out.println("Hello " + name);*/

        /* Random random = new Random();
        System.out.println(random
        .ints());*/

       /*Random random = new Random();
        System.out.println(random
                .ints(80, 95)
                .limit(100) //set limit to show 10 values only
                .mapToObj(s -> (char) s + "") //приводим значимый тим к ссылочному. We can JOIN strings only, that is why specified them as char.
                .collect(Collectors.joining())); //together with sout we have displayed the whole word. We can JOIN strings only*/



       //int [] a={1,2,3,4}; //[]means this is mnozhestvo
        //for (int  i: a ) { //int i - // foreach works with mnozhestvo, it exists specifically for mnozhestvo
       //     System.out.println("i = " + i*/);

       // }


/*int a = 0;
do {
    if (a%2 != 0)
    System.out.println("a=" +a);
    a++;

}
while (a<=100);*/


     /*   for (int i = 0; i <=100 ; i++) {
            if (i%2 == 0)
            System.out.println("i = " + i);

        }
*/
        /* int a=6;
      do {
          System.out.println(a);
          a++;
      }
      while (a<10);*/

        /* int a=0;
        while (a<10) {
           System.out.println(a);
           a++;
       }*/

        /* for (int i = 0; i <= 10; i++) {
            System.out.println("I = " + i);

        }*/

        /*int i = 5;
        switch (i) {
            case 1:
                System.out.println("Mondat");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday - weekend");
                break;
            case 7:
                System.out.println("Sunday - weekend");
                break;
            default:
                System.out.println("There is no such weekday");
        }
        System.out.println("hi");*/


   /* int age = 56;
    String Place;

        if(age >= 3 && age<=6 )
            Place = "KinderGarden";
        else if (age >=7 && age <=17)
            Place = "School";
        else if (age >=18 && age <=22)
            Place = "University";
        else if (age >=23 && age <=65)
            Place = "Job";
        else if (age >=66 && age <=90)
            Place = "Retirement";
        else
            Place = "Rest";
        System.out.println("When you are " + age + " years old you should go to " + Place + ".");*/


        //   int i = 10;
        // int b = i<100? 3+5:12+100; //тернарный оператор, логическое выражение/**/
        //System.out.println(b);

     /*  byte i = 50;
       byte b = 99;
       byte c= (byte) (i+b);
        System.out.println(c);*/
        // System.out.println("4/2=" + 4 / 2 == "4/2=2"); //сравнили две строки. Но с троки черех == сранивать нельзя. А тут работает... мы сравнили адреса здесь, поэтому сработало
        //
        /*for (char i = 'A'; i <='Z' ; i++) {
            System.out.println(i);*/



        /*Random random = new Random();
        System.out.println(random
                .ints(80, 95)
                .limit(100) //set limit to show 10 values only
                .mapToObj(s -> (char) s + "") //приводим значимый тим к ссылочному. We can JOIN strings only, that is why specified them as char.
                .collect(Collectors.joining())); //together with sout we have displayed the whole word. We can JOIN strings only*/
        // .forEach(System.out::println); //
//
//        char i = 71; // i is set as char, so we have set the code of the letter (character)
//        System.out.println(i);
//        System.out.println("\u2122"); //any symbol # can be found in google. \u2122 = ™  unicode in double quotes
//        System.out.println(-0.0==0.0);
        //
//        System.out.println(0.1 + 0.2); //- We need to understand why the result is 0.30000000000000004
//       System.out.println(0,3f + 0.4f);

//        float i = .1f; // - it is not good to use float, we should NEVER use float
        //
//        int i = 7;
//        double b = 2; // to get double, we need to set at least one of them to double
//        System.out.println(i/b);
        //
       /* String s = new Scanner(System.in).next();
        System.out.println(s);*/
        //
       /*int read = System.in.read();
        System.out.println("read = " + (char) read);
        System.out.println((char) read);*/
    }
}
