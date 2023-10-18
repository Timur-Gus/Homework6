public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        System.out.println();
        System.out.print("Числа от 1 до 10: ");
        for (int i = 1; i <= 10; i++)
            System.out.print(i + " ");

        System.out.println("\n");
        System.out.println("Задача 2");
        System.out.println();
        System.out.print("Числа от 10 до 1: ");
        for (int i = 10; i >= 1; i--)
            System.out.print(i + " ");

        System.out.println("\n");
        System.out.println("Задача 3");
        System.out.println();
        System.out.print("Четные числа от 0 до 17: ");
        for (int i = 0; i <= 17; i += 2)
            if(i % 2 == 0 && i != 0) System.out.print(i + " ");
        System.out.println("\n");
        System.out.println("Задача 4");
        System.out.println();
        System.out.print("Числа от 10 до -10: ");
        for (int i = 10; i >= -10; i--)
            System.out.print(i + " ");
        System.out.println("\n");
        System.out.println("Задача 5");
        System.out.println();
        for (int i = 1904; i <= 2096; i += 4)
            System.out.println(i + " год является високосным");
        System.out.println();
        System.out.println("Задача 6");
        System.out.println();
        for (int i = 7; i <= 98; i += 7)
            System.out.print(i + " ");
        System.out.println("\n");
        System.out.println("Задача 7");
        System.out.println();
        for (int i = 1; i <= 512; i *= 2)
            System.out.print(i + " ");
        System.out.println("\n");
        System.out.println("Задача 8");
        System.out.println();
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
}
