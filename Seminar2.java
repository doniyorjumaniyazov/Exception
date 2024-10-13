// import java.util.Scanner;

// public class Seminar2 { 

//     public static float getFloatFromUser() {
//         Scanner scanner = new Scanner(System.in);
//         float number = 0;
//         boolean isValid = false;

//         // Цикл повторяется, пока пользователь не введёт корректное значение
//         while (!isValid) {
//             System.out.print("Введите дробное число (например, 3.14): ");
//             String input = scanner.nextLine();
//             try {
//                 number = Float.parseFloat(input);
//                 isValid = true; // Если ввод корректный, выходим из цикла
//             } catch (NumberFormatException e) {
//                 System.out.println("Ошибка: введено некорректное значение. Пожалуйста, попробуйте снова.");
//             }
//         }

//         return number;
//     }

//     public static void main(String[] args) {
//         float userInput = getFloatFromUser();
//         System.out.println("Вы ввели дробное число: " + userInput);
//     }
// }

// Если необходимо, исправьте данный код 

// try {
//     int d = 0;
//     double catchedRes1 = intArray[8] / d;
//     System.out.println("catchedRes1 = " + catchedRes1);
//  } catch (ArithmeticException e) {
//     System.out.println("Catching exception: " + e);
//  }
// В данном коде есть несколько проблем, которые могут привести к ошибкам или исключениям:

// Деление на ноль: Попытка разделить число на ноль вызовет исключение ArithmeticException. В коде присутствует обработка этого исключения, но сам код пытается выполнить недопустимую операцию.

// Массив intArray не инициализирован: В коде отсутствует объявление и инициализация массива intArray. Это может привести к исключению NullPointerException или ArrayIndexOutOfBoundsException, если массива нет или его длина меньше 9 элементов.

// Исправим эти моменты:

// Нужно добавить проверку деления на ноль до операции деления.
// Добавим инициализацию массива intArray для корректной работы с ним

// public class Seminar2 {

//     public static void main(String[] args) {
//         try {
//             int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Инициализация массива
//             int d = 0;
            
//             // Проверка на деление на ноль
//             if (d != 0) {
//                 double catchedRes1 = intArray[8] / d;
//                 System.out.println("catchedRes1 = " + catchedRes1);
//             } else {
//                 System.out.println("Деление на ноль невозможно.");
//             }

//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Ошибка: Выход за границы массива. " + e);
//         } catch (ArithmeticException e) {
//             System.out.println("Ошибка: Деление на ноль. " + e);
//         }
//     }
// }

//3
// В данном коде есть несколько проблем с обработкой исключений и структурой кода:

// Порядок catch блоков: Блок catch (Throwable ex) должен находиться в конце, так как Throwable является предком всех исключений. Если его поставить первым, остальные блоки для конкретных исключений (NullPointerException и IndexOutOfBoundsException) никогда не будут выполнены, так как любое исключение будет перехвачено в самом первом блоке.

// Исключение FileNotFoundException в методе printSum: Этот метод выбрасывает FileNotFoundException, хотя в нём нет операций, связанных с файлами. Это излишне, и исключение можно убрать.

// public class Seminar2 {
//     public static void main(String[] args) {
//         try {
//             int a = 90;
//             int b = 3;
//             System.out.println(a / b);
//             printSum(23, 234);
//             int[] abc = { 1, 2 };
//             abc[3] = 9; // Здесь произойдет исключение IndexOutOfBoundsException
//         } catch (IndexOutOfBoundsException ex) {
//             System.out.println("Массив выходит за пределы своего размера!");
//         } catch (NullPointerException ex) {
//             System.out.println("Указатель не может указывать на null!");
//         } catch (Throwable ex) {  // Этот блок должен быть последним
//             System.out.println("Что-то пошло не так...");
//         }
//     }

//     public static void printSum(Integer a, Integer b) {
//         System.out.println(a + b);  // Исключение FileNotFoundException здесь не нужно
//     }
// }

//4 Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Seminar2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите строку: ");
            String input = scanner.nextLine();

            // Проверяем, если строка пустая
            if (input.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя.");
            }

            System.out.println("Вы ввели: " + input);
        } catch (Exception e) {
            // Перехватываем и выводим сообщение об ошибке
            System.out.println(e.getMessage());
        }
    }
}
