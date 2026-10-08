import java.util.Scanner;

public class firstlab {

    // задание 1. методы

    // 1. дробная часть
    public double fraction(double x) {
        int intPart = (int) x;
        return x - intPart;
    }

    // 3. букву в число
    public int charToNum(char x) {
        return x - '0';
    }

    // 5. двузначное
    public boolean is2Digits(int x) {
        int abs = x < 0 ? -x : x;
        return abs >= 10 && abs <= 99;
    }

    // 7. диапазон
    public boolean isInRange(int a, int b, int num) {
        return (num >= a && num <= b) || (num >= b && num <= a);
    }

    // 9. равенство
    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    // задание 2. условия

    // 1. модуль числа
    public int abs(int x) {
        if (x < 0) return -x;
        return x;
    }

    // 3. тридцать пять
    public boolean is35(int x) {
        boolean div3 = x % 3 == 0;
        boolean div5 = x % 5 == 0;
        if (div3 && div5) return false;
        return div3 || div5;
    }

    // 5. тройной максимум
    public int max3(int x, int y, int z) {
        int max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }

    // 7. двойная сумма
    public int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) return 20;
        return sum;
    }

    // 9. день недели
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

    // задание 3. циклы

    // 1. числа подряд
    public String listNums(int x) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            sb.append(i);
            if (i < x) sb.append(" ");
        }
        return sb.toString();
    }

    // 3. четные числа
    public String chet(int x) {
        StringBuilder sb = new StringBuilder("0");
        for (int i = 2; i <= x; i = i + 2) {
            sb.append(" ");
            sb.append(i);
        }
        return sb.toString();
    }

    // 5. длина числа
    public int numLen(long x) {
        int count = 1;
        while (x / 10 != 0) {
            x /= 10;
            count++;
        }
        return count;
    }

    // 7. квадрат
    public void square(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 9. правый треугольник
    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // задание 4. массивы

    // 1. поиск первого значения
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    // 3. поиск максимального
    public int maxAbs(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (abs(arr[i]) > abs(max)) max = arr[i];
        }
        return max;
    }

    // 5. добавление массива в массив
    public int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) result[i] = arr[i];
        for (int i = 0; i < ins.length; i++) result[pos + i] = ins[i];
        for (int i = pos; i < arr.length; i++) result[i + ins.length] = arr[i];
        return result;
    }

    // 7. возвратный реверс
    public int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    // 9. все вхождения
    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) count++;
        }
        int[] result = new int[count];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) result[idx++] = i;
        }
        return result;
    }

    // вспомогательные методы

    // преобразование массива в строку
    private String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    // проверка на ввод числа
    private int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Ошибка: введите целое число!");
                sc.next();
            }
        }
    }

    // проверка на вещественное число
    private double readDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                return sc.nextDouble();
            } else {
                System.out.println("Ошибка: введите число!");
                sc.next();
            }
        }
    }

    // проверка на ввод длинного целого числа
    private long readLong(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextLong()) {
                return sc.nextLong();
            } else {
                System.out.println("Ошибка: введите целое число!");
                sc.next();
            }
        }
    }

    // проверка на ввод символа цифры
    private char readDigit(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = sc.next();
            if (value.length() == 1 && value.charAt(0) >= '0' && value.charAt(0) <= '9') {
                return value.charAt(0);
            } else {
                System.out.println("Ошибка: введите одну цифру от 0 до 9!");
            }
        }
    }

    // главный метод

    public static void main(String[] args) {
        firstlab lab = new firstlab();
        Scanner sc = new Scanner(System.in);

        // задание 1
        System.out.println("задание 1. методы");

        double d = lab.readDouble(sc, "1) введите число для дробной части: ");
        System.out.println("дробная часть: " + lab.fraction(d));

        char ch = lab.readDigit(sc, "3) букву в число. введите символ цифры: ");
        System.out.println("результат: " + lab.charToNum(ch));

        int two = lab.readInt(sc, "5) введите число для проверки двузначности: ");
        System.out.println("результат: " + lab.is2Digits(two));

        int a1 = lab.readInt(sc, "7) диапазон. введите a: ");
        int b1 = lab.readInt(sc, "   введите b: ");
        int num = lab.readInt(sc, "   введите num: ");
        System.out.println("входит ли число в диапазон? " + lab.isInRange(a1, b1, num));

        int e1 = lab.readInt(sc, "9) равенство. Введите a: ");
        int e2 = lab.readInt(sc, "   введите b: ");
        int e3 = lab.readInt(sc, "   введите c: ");
        System.out.println("равны ли все три числа? " + lab.isEqual(e1, e2, e3));

        // задание 2
        System.out.println("\nзадание 2. условия");

        int absX = lab.readInt(sc, "1) модуль числа. введите x: ");
        System.out.println("модуль: " + lab.abs(absX));

        int x35 = lab.readInt(sc, "3) тридцать пять. введите x: ");
        System.out.println("результат: " + lab.is35(x35));

        int m1 = lab.readInt(sc, "5) тройной максимум. x: ");
        int m2 = lab.readInt(sc, "   y: ");
        int m3 = lab.readInt(sc, "   z: ");
        System.out.println("максимум: " + lab.max3(m1, m2, m3));

        int s1 = lab.readInt(sc, "7) двойная сумма. x: ");
        int s2 = lab.readInt(sc, "   y: ");
        System.out.println("результат: " + lab.sum2(s1, s2));

        int dayX = lab.readInt(sc, "9) день недели. введите число: ");
        System.out.println("день недели: " + lab.day(dayX));

        // задание 3
        System.out.println("\nзадание 3. циклы");

        int ln = lab.readInt(sc, "1) числа подряд. введите x: ");
        System.out.println("результат: " + lab.listNums(ln));

        int even = lab.readInt(sc, "3) четные числа. введите x: ");
        System.out.println("результат: " + lab.chet(even));

        long len = lab.readLong(sc, "5) длина числа. введите число: ");
        System.out.println("количество цифр: " + lab.numLen(len));

        int sq = lab.readInt(sc, "7) квадрат. введите размер: ");
        lab.square(sq);

        int rt = lab.readInt(sc, "9) правый треугольник. введите высоту: ");
        lab.rightTriangle(rt);

        // задание 4
        System.out.println("\nзадание 4. массивы");

        int[] arr = {1, 2, 3, 4, 2, 2, 5};

        int ff = lab.readInt(sc, "1) поиск первого значения. введите x: ");
        System.out.println("индекс первого вхождения: " + lab.findFirst(arr, ff));

        int[] neg = {1, -2, -7, 4, 2, 2, 5};
        System.out.println("3) поиск максимального: " + lab.maxAbs(neg));

        int[] arr2 = {7, 8, 9};
        int pos = lab.readInt(sc, "5) добавление массива в массив. введите позицию: ");
        while (pos < 0 || pos > arr.length) {
            System.out.println("Ошибка: позиция должна быть от 0 до " + arr.length + "!");
            pos = lab.readInt(sc, "   введите позицию: ");
        }
        System.out.println("результат: " + lab.arrayToString(lab.add(arr, arr2, pos)));

        System.out.println("7) возвратный реверс: " + lab.arrayToString(lab.reverseBack(arr)));

        int fa = lab.readInt(sc, "9) все вхождения. введите x: ");
        System.out.println("индексы всех вхождений: " + lab.arrayToString(lab.findAll(arr, fa)));

        sc.close();
    }
}
