public class Main {
    public static void main(String[] args) {
        vvodYear(199);
        current (0,  2000);
        int days = calculationDays (95);
        System.out.println("days = " + days);


    }
    public static void vvodYear(int year) {
        if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void current(int typeOs, int clientDeviceYear) {
        String type = typeOs == 0 ? "IOS" : "ANDROID";
        String vers = clientDeviceYear > 2015 ? "полную" : "lite";
        System.out.println("Если телефон произведен в "+clientDeviceYear+" году, то небходимо установить "+vers+" версию для типа  "+type);
    }

    public static int calculationDays (int deliveryDistance ) {
        if (deliveryDistance <= 20) {
            return 1;
        } else {
           return  (int) Math.round((double) deliveryDistance / 40) + 1;
        }


    }
}