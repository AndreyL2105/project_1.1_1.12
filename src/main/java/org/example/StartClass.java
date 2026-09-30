package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StartClass {
    public static void menu(){
        int choice = 0;
        while (choice != 13) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                    Для выполнения необходимого действия введите соответствующее число:
                    1 - Проверка числа на четность
                    2 - Проверка больше ли 18 число
                    3 - Проверка больше ли число нуля
                    4 - Преобразование баллов в символ оценки
                    5 - Прием числа для 'Поехали'
                    6 - Проверка суммы целых чисел от одного до n
                    7 - Проверка массива на наличие Bug
                    8 - Проверка четных чисел в диапазоне
                    9 - Проверка на самое большое число в массиве
                    10 - Инверсия элементов массива
                    11 - Проверка среднеарифметического всех чисел в списке
                    12 - Исключения имени из списка
                    13 - Введите для выхода
                    """);

            choice = scanner.nextInt();

            switch (choice){
                case 1: {
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Введите число для проверки на четность:");
                    int arg1 = scanner1.nextInt();
                    boolean resalt1 = ForIsEven.isEven(arg1);
                    if (resalt1){
                        System.out.println("Было введено четное число\n");
                    }
                    else {
                        System.out.println("Было введено нечетное число\n");
                    }
                    break;
                }
                case 2:{
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Введите возраст:");
                    int arg2 = scanner2.nextInt();
                    System.out.println(ForCheckAccess.checkAccess(arg2)+"\n");
                    break;
                }
                case 3:{
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Введите число для проверки");
                    int arg3 = scanner3.nextInt();
                    boolean resalt3 = ForIsPositrive.isPosotive(arg3);
                    if (resalt3){
                        System.out.println("Было введено число >= 0\n");
                    }
                    else {
                        System.out.println("Было введено число < 0\n");
                    }
                    break;
                }
                case 4:{
                    Scanner scanner4 = new Scanner(System.in);
                    System.out.println("Введите баллы для преобразования в символ оценки");
                    int arg4 = scanner4.nextInt();
                    String resalt4 = ForGetGrade.getGrade(arg4);
                    System.out.println("Оценка - "+ resalt4 +"\n");
                    break;
                }
                case 5:{
                    Scanner scanner5 = new Scanner(System.in);
                    System.out.println("Введите число для начала отсчета");
                    int arg5 = scanner5.nextInt();
                    System.out.println(ForBlastOff.blastOff(arg5) +"\n");
                    break;
                }
                case 6:{
                    Scanner scanner6 = new Scanner(System.in);
                    System.out.println("Введите n для подсчета суммы от 1 до n");
                    int arg6 = scanner6.nextInt();
                    System.out.println("Сумма чисел от 1 до n = "+ ForSumToN.sumToN(arg6) +"\n");
                    break;
                }
                case 7:{
                    Scanner scanner7 = new Scanner(System.in);

                    System.out.println("Введите размер массива: ");
                    int n = scanner7.nextInt();
                    scanner7.nextLine();

                    String[] strings = new String[n];

                    System.out.println("Введите " + n + " строк(-и):");
                    for (int i = 0; i<n; i++){
                        strings[i]= scanner7.nextLine();
                    }

                    System.out.println("В переданном массиве есть Bug? -  "+ ForHasBug.hasBug(strings) +"\n");
                    break;
                }
                case 8:{
                    Scanner scanner8 = new Scanner(System.in);

                    System.out.println("Введите нижнюю границу диапазона: ");
                    int start = scanner8.nextInt();
                    System.out.println("Введите верхнюю границу диапазона: ");
                    int end = scanner8.nextInt();

                    System.out.println("Список четных чисел в указанном диапазоне: "+ ForGetEvenInRange.getEventRange(start,end)+"\n");
                    break;
                }
                case 9:{
                    Scanner scanner9 = new Scanner(System.in);

                    System.out.println("Введите размер массива: ");
                    int n = scanner9.nextInt();
                    scanner9.nextLine();

                    int[] array = new int[n];

                    System.out.println("Введите " + n + " элементов массива:");
                    for (int i = 0; i<n; i++){
                        array[i]= scanner9.nextInt();
                    }

                    System.out.println("Максимальнй элемент в переданном массиве - "+ ForFindMax.findMax(array) +"\n");
                    break;
                }
                case 10:{
                    Scanner scanner10 = new Scanner(System.in);

                    System.out.println("Введите размер массива: ");
                    int n = scanner10.nextInt();
                    scanner10.nextLine();

                    String[] strings = new String[n];

                    System.out.println("Введите " + n + " элементов массива:");
                    for (int i = 0; i<n; i++){
                        strings[i]= scanner10.nextLine();
                    }

                    System.out.println("Обратный порядок введенного массива - "+ Arrays.toString(ForRevers.revers(strings)) +"\n");
                    break;
                }
                case 11:{
                    Scanner scanner11 = new Scanner(System.in);

                    System.out.println("Введите размер массива: ");
                    int n = scanner11.nextInt();
                    scanner11.nextLine();

                    List<Integer> list = new ArrayList<>();
                    System.out.println("Введите " + n + " элементов массива:");
                    for (int i = 0; i<n; i++){
                        list.add(scanner11.nextInt());
                    }

                    System.out.println("Среднее арифметическое всех чисел в переданном массиве = " + ForCalcAverage.calcAverage(list)+"\n");

                    break;
                }
                case 12:{
                    Scanner scanner12 = new Scanner(System.in);

                    System.out.println("Введите размер массива: ");
                    int n = scanner12.nextInt();
                    scanner12.nextLine();

                    List<String> list = new ArrayList<>();
                    System.out.println("Введите " + n + " элементов массива:");
                    for (int i = 0; i<n; i++){
                        list.add(scanner12.nextLine());
                    }

                    System.out.println("Введите имя для исключения: ");
                    String name = scanner12.nextLine();


                    System.out.println("Введенный массив без исключенного имени = " + ForRemoveSpecificName.removeSpecificName(list,name)+"\n");

                    break;
                }
            }
        }
    }
}
