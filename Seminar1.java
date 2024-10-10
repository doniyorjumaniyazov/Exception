

// public class Seminar1 {

//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4};
//         int min_length = 5;
//         int res = checkArrayLength(arr, min_length);
//         System.out.println(res);
//     }
//     public static int checkArrayLength(int[] arr, int min_length){
//         if(arr.length > min_length){
//              return -1;
//         }
//         return arr.length;
        
//     }
   

// }

// Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
// значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
// например:
// 1. если длина массива меньше некоторого заданного минимума, метод возвращает -1 в
// качестве кода ошибки.
// 2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
// 3. если вместо массива пришел null, метод вернет -3
// 4. придумайте свои варианты исключительных ситуаций и верните соответствующие
// коды ошибок.
// Напишите метод, в котором реализуете взаимодействие с пользователем. То есть, этот
// метод запросит искомое число у пользователя, вызовет первый метод, обработает
// возвращенное значение и покажет читаемый результат пользователю. Например, если
// вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.


public class Seminar1 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int element = 1;
        int res = searchElement(arr, element);
        System.out.println(res);
    }
    public static int searchElement(int[] arr, int element){
        if(arr == null){
            return -3;
        }
        int min_length = 3;
        if(arr.length < min_length){
            return -1;
        }
        for (int i = 0; i < arr.length;i++){
            if(arr[i] == element){
                return i;
            }
            
        }
        return -2;
    }

    }

    
