public class Main {
    public static void main(String[] args) {
//task 1
        System.out.println("task 1");
        int invest = 15_000;
        float total = 0;
        int month = 0;
        while (total < 2_459_000){
            total = total + total/100;
            total = total + invest;
            ++month;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
        // task 2
        System.out.println("task 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            ++i;
        }
        System.out.println();
        for (i = 10; i >=1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        // task 3
        System.out.println("task 3");
        int population = 12_000_000;
        int birth = 17;
        int death = 8;
        for (int year = 1; year <= 10; year++) {
            population = population + population / 1000 * birth - population / 1000 * death;
            System.out.println("Год " + year + " , численность населения составляет " + population);
        }
        // task 4
        System.out.println("task 4");
        total = 15000;
        for (i = 1; total < 12_000_000; i++){
            total = total + total / 100 * 7;
            System.out.println("Месяц " + i + " сумма накоплений составляет " + total);
        }
        // task 5
        System.out.println("task 5");
        total = 15000;
        for (i = 1; total < 12_000_000; i++) {
            total = total + total / 100 * 7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений составляет " + total);
            }
        }
        //task 6
        System.out.println("task 6");
        total = 15000;
        for (i = 1; i <= 9 * 12; i++) {
            total = total + total / 100 * 7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " накопление составляет " + total);
            }
        }
        //task 7
        System.out.println("task 7");
        for (int friday = 2; friday < 31; friday = friday + 7){
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет");
        }
        // task 8
        System.out.println("task 8");
        for (int year = 2024 - 200; year < 2024 + 100; year++){
            if (year % 79 == 0){
                System.out.println(year);
            }
        }
    }
}