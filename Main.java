import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Laba_1 lab = new Laba_1();

        // Задание 1.1: Дробная часть
        System.out.println("Задание 1.1: Дробная часть");
        System.out.print("Введите число x: ");
        double x1_1 = scanner.nextDouble();
        System.out.println("Результат после отбрасывания дробной части: " + lab.fraction(x1_1));

        // Задание 2.1: Сумма знаков
        System.out.println("\nЗадание 2.1: Сумма знаков");
        System.out.print("Введите число x (не менее 2 знаков): ");
        int x2_1 = scanner.nextInt();
        try {
            System.out.println("Результат сложения двух последних знаков числа х: " + lab.sumLastNums(x2_1));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Задание 3.1: Букву в число
        System.out.println("\nЗадание 3.1: Букву в число");
        System.out.print("Введите символ x (цифра от 0 до 9): ");
        char x3_1 = scanner.next().charAt(0); // Считываем символ
        try {
            System.out.println("Результат после преобразования символа в соответсвующее число: " + lab.charToNum(x3_1));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Задание 4.1: Есть ли позитив
        System.out.println("\nЗадание 4.1: Есть ли позитив");
        System.out.print("Введите число x: ");
        int x4_1 = scanner.nextInt();
        System.out.println("Положительное ли число?: " + lab.isPositive(x4_1));

        // Задание 5.1: Двузначное
        System.out.println("\nЗадание 5.1: Двузначное");
        System.out.print("Введите число x: ");
        int x5_1 = scanner.nextInt();
        System.out.println("Число двузночное?: " + lab.is2Digits(x5_1));

        // Задание 1.2: Модуль числа
        System.out.println("Задание 1.2: Модуль числа");
        System.out.print("Введите число x: ");
        int x1_2 = scanner.nextInt();
        System.out.println("Результат модуля числа х: " + lab.abs(x1_2));

        // Задание 2.2: Безопасное деление
        System.out.println("\nЗадание 2.2: Безопасное деление");
        System.out.print("Введите число x: ");
        int x2_2 = scanner.nextInt();
        System.out.print("Введите число y: ");
        int y2_2 = scanner.nextInt();
        System.out.println("Результат деления х на y: " + lab.safeDiv(x2_2, y2_2));

        // Задание 3.2: Тридцать пять
        System.out.println("\nЗадание 3.2: Тридцать пять");
        System.out.print("Введите число x: ");
        int x3_2 = scanner.nextInt();
        System.out.println("Делится ли число на 3 или 5 нацело?(При этом если делится и на 3 и на 5, то false): " + lab.is35(x3_2));

        // Задание 4.2: Строка сравнения
        System.out.println("\nЗадание 4.2: Строка сравнения");
        System.out.print("Введите число x: ");
        int x4_2 = scanner.nextInt();
        System.out.print("Введите число y: ");
        int y4_2 = scanner.nextInt();
        System.out.println("Результат операции сравнения: " + lab.makeDecision(x4_2, y4_2));

        // Задание 5.2: Тройной максимум
        System.out.println("\nЗадание 5.2: Тройной максимум");
        System.out.print("Введите число x: ");
        int x5_2 = scanner.nextInt();
        System.out.print("Введите число y: ");
        int y5_2 = scanner.nextInt();
        System.out.print("Введите число z: ");
        int z5_2 = scanner.nextInt();
        System.out.println("Максимальное из чисел: " + lab.max3(x5_2, y5_2, z5_2));

        // Задание 1.3: Числа подряд
        System.out.println("Задание 1.3: Числа подряд");
        System.out.print("Введите число x: ");
        int x1_3 = scanner.nextInt();
        System.out.println("Все числа от 0 до х(включительно): " + lab.listNums(x1_3));

        // Задание 2.3: Числа наоборот
        System.out.println("\nЗадание 2.3: Числа наоборот");
        System.out.print("Введите число x: ");
        int x2_3 = scanner.nextInt();
        System.out.println("Все числа от х до 0(включительно): " + lab.reverseListNums(x2_3));

        // Задание 3.3: Четные числа
        System.out.println("\nЗадание 3.3: Четные числа");
        System.out.print("Введите число x: ");
        int x3_3 = scanner.nextInt();
        System.out.println("Все четные числа от 0 до х: " + lab.chet(x3_3));

        // Задание 4.3: Степень числа
        System.out.println("\nЗадание 4.3: Степень числа");
        System.out.print("Введите число x (основание): ");
        int x4_3 = scanner.nextInt();
        System.out.print("Введите число y (степень): ");
        int y4_3 = scanner.nextInt();
        System.out.println("Результат возведения х в степень y: " + lab.pow(x4_3, y4_3));

        // Задание 5.3: Длина числа
        System.out.println("\nЗадание 5.3: Длина числа");
        System.out.print("Введите число x: ");
        long x5_3 = scanner.nextLong();
        System.out.println("Количество знаков в числе х: " + lab.numLen(x5_3));

        // Задание 1.4 (Поиск первого значения)
        System.out.print("Задание 1.4 (Поиск первого значения). ");
        System.out.print("Введите размер массива: ");
        int size1_4 = scanner.nextInt();
        int[] array1_4 = new int[size1_4];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size1_4; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array1_4[i] = scanner.nextInt();
        }
        System.out.print("Введите число для поиска (x): ");
        int searchNumber1_4 = scanner.nextInt();
        int searchResult1_4 = lab.findFirst(array1_4, searchNumber1_4);
        System.out.println("Индекс первого вхождения: " + searchResult1_4);

        // Задание 2.4 (Поиск последнего значения)
        System.out.print("Задание 2.4 (Поиск последнего значения). ");
        System.out.print("Введите размер массива: ");
        int size2_4 = scanner.nextInt();
        int[] array2_4 = new int[size2_4];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size2_4; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array2_4[i] = scanner.nextInt();
        }
        System.out.print("Введите число для поиска (x): ");
        int searchNumber2_4 = scanner.nextInt();
        int searchResult2_4 = lab.findLast(array2_4, searchNumber2_4);
        System.out.println("Индекс последнего вхождения: " + searchResult2_4);

        // Задание 3.4 (Поиск максимального по модулю)
        System.out.print("Задание 3.4 (Поиск максимального по модулю). ");
        System.out.print("Введите размер массива: ");
        int size3_4 = scanner.nextInt();
        int[] array3_4 = new int[size3_4];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size3_4; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array3_4[i] = scanner.nextInt();
        }
        int maxAbsResult = lab.maxAbs(array3_4);
        System.out.println("Максимальное по модулю значение: " + maxAbsResult);

        // Задание 4.4 (Добавление элемента в массив)
        System.out.print("Задание 4.4 (Добавление элемента в массив). ");
        System.out.print("Введите размер исходного массива: ");
        int size4_4 = scanner.nextInt();
        int[] array4_4 = new int[size4_4];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size4_4; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array4_4[i] = scanner.nextInt();
        }
        System.out.print("Введите число для добавления (x): ");
        int numberToAdd4_4 = scanner.nextInt();
        System.out.print("Введите позицию для добавления (pos): ");
        int position4_4 = scanner.nextInt();
        try {
            int[] addResult4_4 = lab.add(array4_4, numberToAdd4_4, position4_4);
            System.out.print("Результат: [");
            for (int i = 0; i < addResult4_4.length; i++) {
                System.out.print(addResult4_4[i]);
                if (i < addResult4_4.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Задание 5.4 (Добавление массива в массив)
        System.out.print("Задание 5.4 (Добавление массива в массив). ");
        System.out.print("Введите размер исходного массива: ");
        int size5_4 = scanner.nextInt();
        int[] array5_4 = new int[size5_4];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size5_4; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array5_4[i] = scanner.nextInt();
        }
        System.out.print("Введите размер массива для вставки (ins): ");
        int sizeIns5_4 = scanner.nextInt();
        int[] arrayIns5_4 = new int[sizeIns5_4];
        System.out.println("Введите элементы массива для вставки:");
        for (int i = 0; i < sizeIns5_4; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arrayIns5_4[i] = scanner.nextInt();
        }
        System.out.print("Введите позицию для вставки (pos): ");
        int position5_4 = scanner.nextInt();

        try {
            int[] addResult5_4 = lab.add(array5_4, arrayIns5_4, position5_4);
            System.out.print("Результат: [");
            for (int i = 0; i < addResult5_4.length; i++) {
                System.out.print(addResult5_4[i]);
                if (i < addResult5_4.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        scanner.close();
    }
}