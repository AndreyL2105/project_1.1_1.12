package tests;

import org.example.ForIsEven;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Random;

// Тестовый класс для проверки числа на четность
public class ForIsEvenTest {
    Random random = new Random();

    @Test
    @Tag("Smoke")
    void isEvenTest(){
        int number = random.nextInt();

        boolean expectedResult;
        if (number % 2 == 0){
            expectedResult = true;
        }
        else {
            expectedResult = false;
        }

        boolean actualResult = ForIsEven.isEven(number);

        if (expectedResult == actualResult) {
            System.out.println("Тест  пройден!");
        }
        else {
            System.out.println("Тест не пройден!");
        }

        if (actualResult) {
            System.out.println("Число " + number + " четное!");
        }
        else {
            System.out.println("Число " + number + " не четное!");
        }
    }

}
