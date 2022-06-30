import java.util.Scanner;

/**
 * Написать метод, который разворачивает строку в обратном порядке и
 * замерить времЯ работы этого метода на 1000, 10 000, 100 000 повторений.
 * Оформить надо в виде stand alone java приложения с консольным вводом строки.
 * Результатом работы должны быть строка, развернутаЯ строка и 3 цифры (времЯ работы).
 */

public class StringRev {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Please, enter the string to reverse");
        String name = console.nextLine();

        long r1000, r10000, r100000;
        String str = "";

        //Запуск реверса на 1000 повторений

        long startTime = System.nanoTime();
        for (int i = 0; i<1000; i++) {
           str = revers(name);
        }
        long endTime = System.nanoTime();
        r1000 = endTime - startTime;

        //Запуск реверса на 10000 повторений

        startTime = System.nanoTime();
        for (int i = 0; i<10000; i++) {
            str = revers(name);
        }
        endTime = System.nanoTime();
        r10000 = endTime - startTime;

        //Запуск реверса на 100000 повторений

        startTime = System.nanoTime();
        for (int i = 0; i<100000; i++) {
            str = revers(name);
        }
        endTime = System.nanoTime();
        r100000 = (endTime - startTime);

        System.out.println("Inverted string: " + str + "\n");
        System.out.println("Working time of the method: ");
        System.out.println("1000 repeats: " + r1000 + "\n" + "10000 repeats: " + r10000 + "\n" + "100000 repeats: " + r100000);
    }

    public static String revers(String s) {
        String rev = "";
        for (int i = s.length()- 1; i >= 0; i--) {
            rev+=s.charAt(i);
        }
        return rev;
    }
}
