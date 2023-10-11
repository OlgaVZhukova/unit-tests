package hw1.Calculator;

public class Calculator {

    public static void main(String[] args) {
        System.out.printf("Результат операции: %s \n",
                calculateDiscount(250, 23));
    }

    public static double calculateDiscount(double amount, int discount) {
        double discountedAmount = 0;
        if (amount >= 0) {
            if (discount >= 0 && discount <= 100) {
                discountedAmount = amount - (amount * discount) / 100;
            } else {
                throw new ArithmeticException("Размер скидки должен быть в диапазоне от 0 до 100");
            }

        } else {
            throw new ArithmeticException("Сумма покупки не может быть отрицательной");
        }
        return discountedAmount;
    }
}
