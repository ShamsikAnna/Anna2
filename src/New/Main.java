package New;

import com.sun.xml.internal.ws.api.addressing.OneWayFeature;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Main {

    public static void main(String[] args) {
	/*//Task #1:
        Scanner Name = new Scanner (System.in);
        System.out.println("Enter you First Name");
        String fName = Name.next();
        System.out.println("Hello " + fName);*/
        /*//Task #2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите последовательность символов: ");
        String inputString = scanner.next();
        String outputString = "";
        for (int i = inputString.length()-1; i >= 0 ; i--) {
            outputString = outputString.concat(String.valueOf(inputString.charAt(i)));
        }
        System.out.print("Обратная последовательность символов: " + outputString);*/
        /*//Task #3
        Random random = new Random();
        System.out.println(random
                .ints(70, 95)
                .limit(10) //set limit to show 10 values only
                .mapToObj(s -> (char) s + "") //приводим значимый тим к ссылочному. We can JOIN strings only, that is why specified them as char.
                .collect(Collectors.joining())); //together with sout we have displayed the whole word. We can JOIN strings only
        System.out.println(random
                .ints(70, 95)
                .limit(10) //set limit to show 10 values only
                .mapToObj(s -> (char) s + "") //приводим значимый тим к ссылочному. We can JOIN strings only, that is why specified them as char.
                .collect(Collectors.joining())); */
        /*//Task #4
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String pass1 = scanner.next();
        String pass2 = "Test";
        if (pass1.equals(pass2))
            System.out.println("Пароль верный");
        else System.out.println("Пароль не верный");*/
        /*//Task #5 - NOT COMPLETED YET
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целые числа: ");
        int value = Scanner.nextInt();
*/

    }
}



