public class Main {
    public static void main(String[] args) {

    }

        private static void calc( int year){
            boolean result = year % 100 != 0 && year % 4 == 0 || year % 400 == 0;
            task1 (year, result);
        }


        private static void task1 ( int year, boolean result){
            year=199;
            if (result) {
                System.out.println(year + " год является високосным.");
            } else {
                System.out.println(year + " год не является високосным.");
            }
        }
}
