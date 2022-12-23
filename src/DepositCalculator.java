import java.util.Scanner;

public class DepositCalculator {

    double calculateComplexPercent(double a, double y, int d) {
        double pay = a * Math.pow((1 + y / 12), 12 * d);
        return round(pay, 2);
    }

    double calculateSimplePercent(double doubleAmount, double double_year_rate, int deposit_period) {
        return round(doubleAmount + doubleAmount * double_year_rate * deposit_period, 2);
    }

    double round(double value, int places) {
        double scaLe = Math.pow(10, places);
        return Math.round(value * scaLe) / scaLe;
    }

    void doImportantJob( ) {
        int period;
        int action;
        Scanner input = new Scanner(System.in);

        System.out.println("Введите сумму вклада в рублях:");
        int amount = input.nextInt();

        System.out.println("Введите срок вклада в годах:");
        period = input.nextInt();

        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = input.nextInt();

        double output = 0;
        if (action == 1) {
            output = calculateSimplePercent(amount, 0.06, period);
        } else if (action == 2) {
            output = calculateComplexPercent(amount, 0.06, period);
        }

        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + output);
    }

    public static void main(String[] args) {
        new DepositCalculator().doImportantJob();
    }
}
