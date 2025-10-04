import java.util.Random;
import java.util.Scanner;

public class Laba_1 {
    //Задание 1.1
    //Возвращает дробную часть числа x.
    public double fraction(double x) {
        return x - (int) x;
    }

    //Задание 2.1
    //Возвращает сумму двух последних цифр числа x, предполагая, что в числе не менее двух цифр.
    public int sumLastNums(int x) {
        if (x < 10) {
            throw new IllegalArgumentException("Число должно содержать как минимум две цифры.");
        }

        return (x % 10) + ((x / 10) % 10);
    }

    //Задание 3.1
    //Преобразует символ x, представляющий одну из цифр '0' - '9', в соответствующее число.
    public int charToNum(char x) {
        if (x < '0' || x > '9') {
            throw new IllegalArgumentException("Символ должен быть цифрой от '0' до '9'.");
        }

        return x - '0';
    }

    //Задание 4.1
    //Проверяет, является ли число x положительным.
    public boolean isPositive(int x) {
        return x > 0;
    }

    //Задание 5.1
    //Проверяет, является ли число x двузначным.
    public boolean is2Digits(int x) {
        return (x >= 10) && (x <= 99);
    }

    //Задание 1.2
    //Возвращает абсолютное значение числа x.
    public int abs(int x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    //Задание 2.2
    //Выполняет безопасное деление x на y, избегая деления на 0.
    public double safeDiv(int x, int y) {
        if (y == 0) {
            return 0.0; // Возвращаем 0 при делении на 0.  Важно возвращать double (0.0), а не int (0).
        } else {
            return (double) x / y; // Преобразуем x к double, чтобы деление было с плавающей точкой.
        }
    }

    //Задание 3.2
    //Проверяет, делится ли число x нацело на 3 или 5, но не на оба одновременно
    public boolean is35(int x) {
        return (x % 3 == 0) ^ (x % 5 == 0);
    }

    //Задание 4.2
    //Возвращает строку, которая включает два принятых методом числа и корректно выставленный
    //знак операции сравнения (больше, меньше, или равно).
    public String makeDecision(int x, int y) {
        if (x < y) {
            return x + "<" + y;
        } else if (x > y) {
            return x + ">" + y;
        } else {
            return x + "==" + y;
        }
    }

    //Задание 5.2
    //Возвращает максимальное из трех полученных методом чисел.
    public int max3(int x, int y, int z) {
        int max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }

    //Задание 1.3
    //Возвращает строку, содержащую числа от 0 до x (включительно), разделенные пробелами.
    public String listNums(int x) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            sb.append(i);
            if (i < x) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    //Задание 2.3
    //Возвращает строку, содержащую числа от x до 0 (включительно), разделенные пробелами.
    public String reverseListNums(int x) {
        StringBuilder sb = new StringBuilder();
        for (int i = x; i >= 0; i--) {
            sb.append(i);
            if (i > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    //Задание 3.3
    //Возвращает строку, содержащую четные числа от 0 до x (включительно), разделенные пробелами.
    public String chet(int x) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            sb.append(i);
            if (i < x - 1 || (i == x && x % 2 == 0)) { // Проверка для добавления пробела
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    //Задание 4.3
    //Возвращает результат возведения числа x в степень y.
    public int pow(int x, int y) {
        int result = 1; // Инициализируем результат единицей (нейтральный элемент для умножения)
        for (int i = 0; i < y; i++) {
            result *= x; // Умножаем result на x y раз
        }
        return result;
    }

    //Задние 5.3
    //Возвращает количество знаков в числе x.
    public int numLen(long x) {
        if (x == 0) {
            return 1; // Особый случай: длина числа 0 равна 1
        }

        int count = 0;
        long num = Math.abs(x); // Обрабатываем отрицательные числа, взяв абсолютное значение

        while (num > 0) {
            num /= 10;
            count++;
        }

        return count;
    }

    //Задание 1.4
    //Возвращает индекс первого вхождения числа x в массив arr.
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; // Нашли первое вхождение, возвращаем индекс
            }
        }
        return -1; // Число не найдено в массиве
    }

    //Задание 2.4
    //Возвращает индекс последнего вхождения числа x в массив arr.
    public int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i; // Нашли последнее вхождение, возвращаем индекс
            }
        }
        return -1; // Число не найдено в массиве
    }

    //Задание 3.4
    //Возвращает наибольшее по модулю значение массива arr.
    public int maxAbs(int[] arr) {
        if (arr == null || arr.length == 0) {
            // Обработка краевого случая: если массив пуст или null, возвращаем 0
            return 0;
        }

        int maxAbsValue = Math.abs(arr[0]); // Инициализируем наибольшее значение модулем первого элемента
        int result = arr[0]; // Инициализируем результат первым элементом

        for (int i = 1; i < arr.length; i++) {
            int absValue = Math.abs(arr[i]);
            if (absValue > maxAbsValue) {
                maxAbsValue = absValue;
                result = arr[i];
            }
        }

        return result;
    }

    //Задание 4.4
    //Возвращает новый массив, который содержит все элементы arr, но с вставленным x в позицию pos.
    public int[] add(int[] arr, int x, int pos) {
        if (pos < 0 || pos > arr.length) {
            throw new IllegalArgumentException("Позиция pos выходит за границы массива.");
        }

        int[] newArr = new int[arr.length + 1]; // Создаем новый массив на 1 элемент больше

        // Копируем элементы до позиции pos
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        // Вставляем значение x в позицию pos
        newArr[pos] = x;

        // Копируем оставшиеся элементы, сдвигая их на 1 позицию вправо
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }

    //Задание 5.4
    //Возвращает новый массив, который содержит все элементы arr, но с вставленным ins в позицию pos.
    public int[] add(int[] arr, int[] ins, int pos) {
        if (pos < 0 || pos > arr.length) {
            throw new IllegalArgumentException("Позиция pos выходит за границы массива.");
        }

        int[] newArr = new int[arr.length + ins.length]; // Создаем новый массив нужной длины

        // Копируем элементы до позиции pos
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        // Вставляем массив ins в позицию pos
        for (int i = 0; i < ins.length; i++) {
            newArr[pos + i] = ins[i];
        }

        // Копируем оставшиеся элементы, сдвигая их на длину ins
        for (int i = pos; i < arr.length; i++) {
            newArr[pos + ins.length + i - pos] = arr[i];  //или проще newArr[pos + ins.length + i - pos] = arr[i];
        }

        return newArr;
    }
}
