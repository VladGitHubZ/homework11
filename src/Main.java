import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void installApp(int clientDeviceYear, int osType) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear) {
            System.out.print("Установите облегченную версию приложения для ");
        } else {
            System.out.print("Установите приложение для ");
        }

        if (osType == 0) {
            System.out.println("iOS по ссылке");
        } else {
            System.out.println("Android по ссылке");
        }
    }

    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return 0; // Доставка невозможна
        }
    }

    public static void main(String[] args) {
        System.out.println("Task01");
        int year = 2024;
        if (isLeapYear(year)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
        System.out.println("Task02");
        int clientDeviceYear = 2015;
        int osType = 1; //  1 if Android, 0 if iOS
        installApp(clientDeviceYear, osType);

        System.out.println("Task03");
        int distance = 10; // Расстояние до клиента (в километрах)
        int deliveryDays=calculateDeliveryDays(distance);
        if (deliveryDays > 0) {
            System.out.println("Потребуется дней: " + deliveryDays + ".");
        } else System.out.println("Доставка невозможна.");

    }
}