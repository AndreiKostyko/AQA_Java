import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFactorial {

    @DisplayName("Тест метода вычисления факториала")
    @ParameterizedTest
    @CsvSource({
            "5, 120",
            "5, 121"
    })
    public void testFactorial(int factorial, int exp) {
        int actFactorial = Factorial.getFactorial(factorial);
        assertAll(
                "Сложный сценарий сравнение адреса",
                () -> assertEquals(actFactorial, exp)
        );
    }
}