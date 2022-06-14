public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1.Создание переменных и вывод их значений на консоль");
        byte nucleus = 2;
        short systemType = 64;
        int cpu = 64;
        long memoryD = 247;
        float ram = 16.0F;
        double memoryC = 232.0;
        char char1 = 'o';
        boolean worksPC = true;
        System.out.println(nucleus + "\n" + systemType + "\n" + cpu + "\n" + memoryD + "\n" + ram + "\n" + memoryC + "\n" + char1 + "\n" + worksPC);

        System.out.println("\n2.Расчет стоимости товара со скидкой");
        int x = 100;
        int y = 200;
        double sale = 11;
        System.out.println((int)sale + "%");
        System.out.println((x + y) - ((x + y) * 11 / 100));

        System.out.println("\n3.Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4.Отображение min и max значений числовых типов данных");
        byte byteMax = Byte.MAX_VALUE;
        short shortMax = Short.MAX_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMax = Long.MAX_VALUE;
        System.out.println(byteMax + " " + ++byteMax + " " + --byteMax);
        System.out.println(shortMax + " " + ++shortMax + " " + --shortMax);
        System.out.println(intMax + " " + ++intMax + " " + --intMax);
        System.out.println(longMax + " " + ++longMax + " " + --longMax);

        System.out.println("\n5.Перестановка значений переменных");
        double number1 = 1.1;
        double number2 = 2.2;
        System.out.println("с помощью третьей переменной" + " " + number1 + " " + number2);
        double temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("с помощью третьей переменной" + " " + number1 + " " + number2);
        System.out.println("с помощью арифметических операций" + " " + number1 + " " + number2);
        number1 = number1 - number2;
        number2 = number2 + number2;
        System.out.println("с помощью арифметических операций" + " " + number1 + " " + number2);
        System.out.println("с помощью побитовой операции" + " " + number1 + " " + number2);
        int value3 = (int) (number2 * 10) ^ (int) (number1 * 10) ;
        number1 = value3 ^ (int) (number1 * 10);
        number2 = value3 ^ (int) (number2 * 10);
        System.out.println("с помощью побитовой операции" + " " + ((number1 / 10) + " " + (number2 / 10)));

        System.out.println("\n6.Вывод символов и их кодов");
        int symbol1 = 35;
        int symbol2 = 38;
        int symbol3 = 64;
        int symbol4 = 94;
        int symbol5 = 95;
        System.out.println(symbol1 + " " + (char)symbol1);
        System.out.println(symbol2 + " " + (char)symbol2);
        System.out.println(symbol3 + " " + (char)symbol3);
        System.out.println(symbol4 + " " + (char)symbol4);
        System.out.println(symbol5 + " " + (char)symbol5);

        System.out.println("\n7.Произведение и сумма цифр числа");
        int number = 345;
        int sum = (number / 100) + ((number / 10) % 10) + (number % 10);
        int product = (number / 100) * ((number / 10) % 10) * (number % 10);
        System.out.println("сумма цифр числа " + number + " = " + sum);
        System.out.println("произведение цифр числа " + number + " = " + product);

        System.out.println("\n8.Вывод на консоль ASCII-арт Дюка");
        String space = " ";
        String slash = "/";
        String backSlash = "\\";
        String underlining = "_";
        String openBracket = "(";
        String closeBracket = ")";
        System.out.println(space + space + space + space + slash + backSlash + space + space + space + space);
        System.out.println(space + space + space + slash + space + space + backSlash + space + space + space);
        System.out.println(space + space + slash + underlining + openBracket + space + closeBracket + backSlash + space + space);
        System.out.println(space + slash + space + space + space + space + space + space + backSlash + space);
        System.out.println(slash + underlining + underlining + underlining + underlining + slash + backSlash + underlining + underlining + backSlash);

        System.out.println("\n9.Отображение количества сотен, десятков и единиц числа");
        number = 123;
        System.out.println("Число " + number + " содержит:\n" + (number / 100) + " сотен\n" + ((number / 10) % 10) + " десятков\n" + (number % 10) + " единиц");

        System.out.println("\n10.Преобразование секунд");
        number = 86399;
        double hour = (number / 60 / 60);
        double minutes = (number / 60) % 60;
        double seconds = minutes % 60;

        System.out.println((int)hour + ":" + (int)minutes + ":" + (int)seconds);
    }
}
