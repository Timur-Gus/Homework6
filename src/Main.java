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
    }
}
