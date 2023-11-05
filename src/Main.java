public class Main {
    public static void main(String[] args) {

        int balance = 200;
        int cashback = 0;
        int replenishment = 400;

        balance = balance + replenishment;
        if (replenishment > 1000) {
            cashback = replenishment / 100;
        } else {
            System.out.println("Баланс: " + balance);
            System.out.println("Сумма пополнения: " + replenishment);
            System.out.println("Бонусные рубли начисляються при пополнении более 1000 рублей");
        }

    }
}
