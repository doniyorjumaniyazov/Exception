// //№1

// public class Hwork1 {

//     // Метод вызывает деление на ноль, что приведёт к ArithmeticException
//     public static void generateArithmeticException() {
//         int result = 10 / 0; // Это вызовет ArithmeticException
//     }

//     // Метод вызывает доступ к элементу массива за пределами его длины, что вызовет ArrayIndexOutOfBoundsException
//     public static void generateArrayIndexOutOfBoundsException() {
//         int[] array = new int[3];
//         int value = array[5]; // Это вызовет ArrayIndexOutOfBoundsException
//     }

//     // Метод вызывает NullPointerException, пытаясь вызвать метод у null-объекта
//     public static void generateNullPointerException() {
//         String str = null;
//         str.length(); // Это вызовет NullPointerException
//     }

//     public static void main(String[] args) {
//         try {
//             generateArithmeticException();
//         } catch (ArithmeticException e) {
//             System.out.println("ArithmeticException пойман: " + e.getMessage());
//         }

//         try {
//             generateArrayIndexOutOfBoundsException();
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("ArrayIndexOutOfBoundsException пойман: " + e.getMessage());
//         }

//         try {
//             generateNullPointerException();
//         } catch (NullPointerException e) {
//             System.out.println("NullPointerException пойман: " + e.getMessage());
//         }
//     }
// }
// //№2
// Объяснение:
// ArithmeticException — возникает при делении на ноль.
// ArrayIndexOutOfBoundsException — возникает при попытке доступа к элементу массива с индексом, превышающим его границы.
// NullPointerException — возникает, когда пытаетесь вызвать метод у null-объекта.


 //В приведённом методе sum2d могут возникнуть несколько типов исключений. Рассмотрим их подробнее:

//  ArrayIndexOutOfBoundsException:

// Это исключение возникнет, если длина внутреннего массива (в строке arr[i]) будет меньше 5.
// Так как цикл ограничен фиксированным значением j < 5, если одна из строк массива arr[i] окажется короче, произойдет попытка доступа к несуществующему индексу.
// 
//NumberFormatException:

// Это исключение возникает, если элемент массива arr[i][j] не может быть преобразован в целое число с помощью метода Integer.parseInt(). Например, если элемент будет содержать не числовую строку или будет пустым.

// NullPointerException:

// Это исключение может возникнуть, если одна из строк массива arr[i] равна null. Например, если arr[i] окажется null, попытка доступа к элементам arr[i][j] приведет к исключению.

// №3
// public class ArrayDifference {

//     public static int[] subtractArrays(int[] arr1, int[] arr2) {
//         // Проверка на равенство длин массивов
//         if (arr1.length != arr2.length) {
//             throw new IllegalArgumentException("Длины массивов не равны!");
//         }

//         // Создание нового массива для хранения разностей
//         int[] result = new int[arr1.length];

//         // Вычисление разности поэлементно
//         for (int i = 0; i < arr1.length; i++) {
//             result[i] = arr1[i] - arr2[i];
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int[] array1 = {10, 20, 30, 40};
//         int[] array2 = {5, 15, 25, 35};

//         try {
//             int[] result = subtractArrays(array1, array2);
//             System.out.println("Результат:");
//             for (int value : result) {
//                 System.out.print(value + " ");
//             }
//         } catch (IllegalArgumentException e) {
//             System.out.println("Ошибка: " + e.getMessage());
//         }
//     }
// }

// // №4

// public class ArrayDivision {

//     public static int[] divideArrays(int[] arr1, int[] arr2) {
//         // Проверка на равенство длин массивов
//         if (arr1.length != arr2.length) {
//             throw new RuntimeException("Длины массивов не равны!");
//         }

//         int[] result = new int[arr1.length];

//         // Вычисление частного поэлементно
//         for (int i = 0; i < arr1.length; i++) {
//             if (arr2[i] == 0) {
//                 throw new RuntimeException("Деление на ноль в ячейке: " + i);
//             }
//             result[i] = arr1[i] / arr2[i];
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int[] array1 = {10, 20, 30, 40};
//         int[] array2 = {2, 4, 0, 8};

//         try {
//             int[] result = divideArrays(array1, array2);
//             System.out.println("Результат:");
//             for (int value : result) {
//                 System.out.print(value + " ");
//             }
//         } catch (RuntimeException e) {
//             System.out.println("Ошибка: " + e.getMessage());
//         }
//     }
// }

