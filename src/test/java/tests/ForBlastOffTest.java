package tests;

import org.example.ForBlastOff;
import org.example.ForIsEven;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Random;

//Тестовый класс для проверки приема чила для "Поехали!"
public class ForBlastOffTest {
    Random random = new Random();

    @Test
    @Tag("Smoke")
    void blastOffTest(){
        int number = random.nextInt(1,10);
        int cycle = number;

        StringBuilder str = new StringBuilder();
        while (cycle!=0) {
            str.append(cycle);
            str.append(" ");
            if (cycle == 1) str.append("Поехали!");
            cycle--;
        }
        String expectedResult = str.toString();

        String actualResult = ForBlastOff.blastOff(number);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Тест  пройден!");
        }
        else {
            System.out.println("Тест не пройден!");
        }
        System.out.println("Ожидаемый результат: " + expectedResult + "\n" + "Фактический результат: " + actualResult);
    }
}
