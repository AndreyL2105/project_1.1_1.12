package tests;

import org.example.ForSumToN;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Random;

//Тестовый класс для проверки суммы всех чисел от 1 до n
public class ForSumToNTest {
    Random random = new Random();

    @Test
    @Tag("Smoke")
    void sumToNTest(){
        int number = random.nextInt(1,100);

        int expectedResult = number*(number+1)/2;
        int actualResult = ForSumToN.sumToN(number);

        if(expectedResult == actualResult){
            System.out.println("Тест пройден!");
        }
        else {
            System.out.println("Тест не пройден!");
        }
        System.out.println("Ожидаемый результат: " + expectedResult + "\n" + "Фактический результат: " + actualResult);

    }
}
