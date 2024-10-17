import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserDataApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные (Фамилия Имя Отчество дата_рождения номер_телефона пол):");
        String input = scanner.nextLine();
        String[] data = input.trim().split("\\s+");

        try {
            // Проверка количества введённых данных
            if (data.length < 6) {
                throw new InvalidDataCountException("Введено меньше данных, чем требуется.");
            } else if (data.length > 6) {
                throw new InvalidDataCountException("Введено больше данных, чем требуется.");
            }

            String surname = data[0];
            String name = data[1];
            String patronymic = data[2];
            String dob = data[3];
            String phoneStr = data[4];
            String gender = data[5];

            // Валидация даты рождения
            if (!dob.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
                throw new InvalidDateFormatException("Неверный формат даты рождения. Ожидается dd.mm.yyyy.");
            }

            // Валидация номера телефона
            long phone;
            try {
                phone = Long.parseLong(phoneStr);
                if (phone < 0) {
                    throw new InvalidPhoneNumberException("Номер телефона не может быть отрицательным.");
                }
            } catch (NumberFormatException e) {
                throw new InvalidPhoneNumberException("Номер телефона должен содержать только цифры.");
            }

            // Валидация пола
            if (!gender.equalsIgnoreCase("f") && !gender.equalsIgnoreCase("m")) {
                throw new InvalidGenderException("Пол должен быть 'f' или 'm'.");
            }

            // Формирование строки для записи
            String record = String.format("<%s><%s><%s><%s> <%d><%s>", 
                                          surname, name, patronymic, dob, phone, gender.toLowerCase());

            // Запись в файл
            try (FileWriter writer = new FileWriter(surname + ".txt", true)) {
                writer.write(record + System.lineSeparator());
                System.out.println("Данные успешно записаны в файл " + surname + ".txt");
            } catch (IOException e) {
                System.err.println("Ошибка при записи в файл:");
                e.printStackTrace();
            }

        } catch (InvalidDataCountException | InvalidDateFormatException |
                 InvalidPhoneNumberException | InvalidGenderException e) {
            System.err.println("Ошибка ввода данных: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

// Пользовательские исключения

class InvalidDataCountException extends Exception {
    public InvalidDataCountException(String message) {
        super(message);
    }
}

class InvalidDateFormatException extends Exception {
    public InvalidDateFormatException(String message) {
        super(message);
    }
}

class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

class InvalidGenderException extends Exception {
    public InvalidGenderException(String message) {
        super(message);
    }
}


