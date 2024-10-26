//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }
        System.out.println("Задача 2");
        for (int b = 10; b >= 1; b--) {
            System.out.println(b);
        }
        System.out.println("Задача 3");
        for (int c = 0; c < 17; c = c + 2) {
            System.out.println(c);
        }
        System.out.println("Задача 4");
        for (int d = 10; d >= -10; d--) {
            System.out.println(d);
        }
        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year +  " год является високосным");
        }
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i +7) {
            System.out.println(i);
        }
        System.out.println("Задача 7");
        for (int f = 1; f <= 512; f = f * 2) {
            System.out.println(f);
        }
        System.out.println("Задача 8");
        int salery = 29000;
        int total = 0;
        for (int g = 1; g <= 12; g++) {
            total = total + salery;
            System.out.println("Месяц " + g + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задача 9");
        int salary1 = 29000;
        int total1 = 0;
        for (int h = 1; h <=12; h++ ) {
            total1 = total1 + total1/100;
            total1 = total1 + salary1;
            System.out.println("Месяц " + h + " сумма накоплений равна " + total1 + " рублей");
        }

    }

}