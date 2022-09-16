public class Main {
    public static void main(String[] args) {
        int threshold = 1000;
        int replenishmentAmount = 700;
        int currentSum = 400;
        int finalScore = replenishmentAmount + currentSum;
        int bonus;

        if (finalScore > threshold) {
            bonus = (finalScore - replenishmentAmount) / 100;
        } else {
            bonus = 0;
        }
        if (replenishmentAmount <= 1000) {
            bonus = (replenishmentAmount + currentSum - threshold) / 100;
            if (bonus <= 0) {
                System.out.println("Ваш баланс равен " + finalScore);
            } else {
                System.out.println("Ваш бонус равен " + bonus);
                System.out.println("Ваш баланс равен " + finalScore);
            }
        }
    }
}