public class Main {
    public static void main(String[] args) {
        int threshold = 1000;
        int replenishmentAmount = 10000;
        int currentSum = 400;
        int finalScore = replenishmentAmount + currentSum;
        int bonus;

        if (finalScore > threshold) {
            bonus = (finalScore - threshold) / 100;
            System.out.println("Ваш баланс равен " + finalScore);
            System.out.println("Ваш бонус равен " + bonus);
        } else {
            bonus = 0;
            System.out.println("Ваш баланс равен " + finalScore);
        }
        if (replenishmentAmount >= 1000) {
            bonus = (replenishmentAmount + currentSum - threshold) / 100;
            if (bonus <= 0) {
                System.out.println("Ваш баланс равен " + finalScore);
                System.out.println("Ваш бонус равен " + bonus);
            }
        }
    }
}