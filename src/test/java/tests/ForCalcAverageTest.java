package tests;

import org.example.ForCalcAverage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Тестовый класс для проверки среднего арифметического числа в списке
public class ForCalcAverageTest {

    @Test
    @Tag("Smoke")
    void calcAverageTest(){
        Random random = new Random();
        //Переменная для определения количества значений в списке
        int number = random.nextInt(1,10);

        List<Integer> list = new ArrayList<>();
        for (int i = number ; i>0; i--){
            // Переменная для заполнения списка
            int number2 = random.nextInt(1,100000);
            list.add(number2);
        }

        int expectedResult = 0;
        if(!list.isEmpty()){
            int sum = 0;
            for (Integer num: list){
                sum = sum+num;
            }
            expectedResult = sum / list.size();
        }

        int actualResult = ForCalcAverage.calcAverage(list);

        if (expectedResult==actualResult){
            System.out.println("Тест пройден!");
        }
        else {
            System.out.println("Тест не пройден!");
        }
        System.out.println("Ожидаемый результат: " + expectedResult + "\n" + "Фактический результат: " + actualResult);

    }
}
