public class Main {
    public static void main(String[] args) {
        task1();


    }
    public static void calculationHighYear(int year) {
    }

    private static void task1() {
        int year = 199;
        if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }
}