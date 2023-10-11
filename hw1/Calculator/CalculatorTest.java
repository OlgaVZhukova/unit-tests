package hw1.Calculator;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
        public void testCalculateDiscount() {

                // Проверка результата работы метода
                assertThat(Calculator.calculateDiscount(100, 10)).isEqualTo(192.5);
                assertThat(Calculator.calculateDiscount(250, 23)).isEqualTo(90.0);

                // Отрицательные числа. Сумма покупки
                assertThatThrownBy(() -> Calculator.calculateDiscount(-1000, 50))
                                .isInstanceOf(ArithmeticException.class)
                                .hasMessage("Сумма покупки не может быть отрицательной");

                // Отрицательные числа. Процент скидки
                assertThatThrownBy(() -> Calculator.calculateDiscount(1000, -5))
                                .isInstanceOf(ArithmeticException.class)
                                .hasMessage("Размер скидки должен быть в диапазоне от 0 до 100");

                // Процент > 100
                assertThatThrownBy(() -> Calculator.calculateDiscount(1000, 101))
                                .isInstanceOf(ArithmeticException.class)
                                .hasMessage("Размер скидки должен быть в диапазоне от 0 до 100");
        }
}
