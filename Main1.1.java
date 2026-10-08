public class Main {
    public double fraction(double x) {
        return x - (int) x;
    }

    public int charToNum(char x) {
        return x - '0';
    }

    public boolean is2Digits(int x) {
        return (x >= 10 && x <= 99) || (x >= -99 && x <= -10);
    }

    public boolean isInRange(int a, int b, int num) {
        return (num >= a && num <= b) || (num >= b && num <= a);
    }

    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    public int abs(int x) {
        if (x < 0) return -x;
        return x;
    }

    public boolean is35(int x) {
        if (x % 3 == 0 && x % 5 == 0) return false;
        return x % 3 == 0 || x % 5 == 0;
    }

    public int max3(int x, int y, int z) {
        if (y > x) x = y;
        if (z > x) x = z;
        return x;
    }

    public int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) return 20;
        return sum;
    }

    public String day(int x) {
        switch (x) {
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default: return "это не день недели";
        }
    }

    public String listNums(int x) {
        String result = "0";
        for (int i = 1; i <= x; i++) {
            result = result + " " + i;
        }
        return result;
    }

    public String chet(int x) {
        String result = "0";
        for (int i = 2; i <= x; i = i + 2) {
            result = result + " " + i;
        }
        return result;
    }

    public int numLen(long x) {
        int count = 1;
        while (x / 10 != 0) {
            x = x / 10;
            count++;
        }
        return count;
    }

    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = i; j < x; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    public int maxAbs(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (abs(arr[i]) > abs(max)) max = arr[i];
        }
        return max;
    }

    public int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            result[i + ins.length] = arr[i];
        }
        return result;
    }

    public int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) count++;
        }
        int[] result = new int[count];
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[pos] = i;
                pos++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main lab = new Main();

        System.out.println("Задание 1. Методы");
        System.out.println("1. Дробная часть: x = 5.25 -> " + lab.fraction(5.25));
        System.out.println("3. Букву в число: x = '3' -> " + lab.charToNum('3'));
        System.out.println("5. Двузначное: x = 32 -> " + lab.is2Digits(32));
        System.out.println("7. Диапазон: a = 5, b = 1, num = 3 -> " + lab.isInRange(5, 1, 3));
        System.out.println("9. Равенство: a = 3, b = 3, c = 3 -> " + lab.isEqual(3, 3, 3));

        System.out.println("Задание 2. Условия");
        System.out.println("1. Модуль числа: x = -3 -> " + lab.abs(-3));
        System.out.println("3. Тридцать пять: x = 15 -> " + lab.is35(15));
        System.out.println("5. Тройной максимум: x = 5, y = 7, z = 7 -> " + lab.max3(5, 7, 7));
        System.out.println("7. Двойная сумма: x = 5, y = 7 -> " + lab.sum2(5, 7));
        System.out.println("9. День недели: x = 5 -> " + lab.day(5));

        System.out.println("Задание 3. Циклы");
        System.out.println("1. Числа подряд: x = 5 -> " + lab.listNums(5));
        System.out.println("3. Четные числа: x = 9 -> " + lab.chet(9));
        System.out.println("5. Длина числа: x = 12567 -> " + lab.numLen(12567));
        System.out.println("7. Квадрат: x = 4");
        lab.square(4);
        System.out.println("9. Правый треугольник: x = 4");
        lab.rightTriangle(4);

        System.out.println("Задание 4. Массивы");
        System.out.println("1. Поиск первого значения: arr = [1,2,3,4,2,2,5], x = 2 -> "
                + lab.findFirst(new int[]{1, 2, 3, 4, 2, 2, 5}, 2));
        System.out.println("3. Поиск максимального: arr = [1,-2,-7,4,2,2,5] -> "
                + lab.maxAbs(new int[]{1, -2, -7, 4, 2, 2, 5}));

        int[] arr = {1, 2, 3, 4, 5};
        int[] ins = {7, 8, 9};
        int[] result = lab.add(arr, ins, 3);
        System.out.print("5. Добавление массива в массив: arr = [1,2,3,4,5], ins = [7,8,9], pos = 3 -> ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();

        result = lab.reverseBack(arr);
        System.out.print("7. Возвратный реверс: arr = [1,2,3,4,5] -> ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();

        result = lab.findAll(new int[]{1, 2, 3, 8, 2, 2, 9}, 2);
        System.out.print("9. Все вхождения: arr = [1,2,3,8,2,2,9], x = 2 -> ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
