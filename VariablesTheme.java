public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль:");
        byte screenDiagonal = 19;
        short memory = 500;
        int versionLenovoS = 340;
        long computerPrice = 55_000;
        float weight = 1.2f;
        double height = 14.8;
        char model = 'S';
        System.out.println("Notebook Lenovo, model" + model + versionLenovoS +
                "\n Screen Diagonal: " + screenDiagonal +
                "\n Memory: " + memory + " Gb SSD" +
                "\n weight: " + weight + "kg" +
                "\n height: " + height + "cm" +
                "\n price: " + computerPrice + "rub");


        System.out.println();

        System.out.println("2. Расчет стоимости товара со скидкой");

        double x = 100;
        double y = 200;
        double priceSale = (x + y) * 0.11;
        System.out.println("Сумма скидки от 300: " + priceSale);
        System.out.println("Сумма товара со скидкой: " + (int) (x + y + priceSale));

        System.out.println();

        System.out.println("3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a   " +
                "\n   J   a a  v   v  a a  " +
                "\nJ  J  aaaaa  V V  aaaaa " +
                "\n JJ  a     a  V  a     a");

        System.out.println();

        System.out.println("4. Отображение min и max значений числовых типов данных");

        System.out.println("Min значение байта = " + Byte.MIN_VALUE);
        System.out.println("Max значение байта = " + Byte.MAX_VALUE);
        System.out.println("Min short значение = " + Short.MIN_VALUE);
        System.out.println("Max short значение = " + Short.MAX_VALUE);
        System.out.println("Min int значение = " + Integer.MIN_VALUE);
        System.out.println("Max int значение = " + Integer.MAX_VALUE);
        System.out.println("Min long значение = " + Long.MIN_VALUE);
        System.out.println("Max long значение = " + Long.MAX_VALUE);
        System.out.println("MIn float значение = " + Float.MIN_VALUE);
        System.out.println("Max float значение = " + Float.MAX_VALUE);
        System.out.println("Min double значение = " + Double.MIN_VALUE);
        System.out.println("Max double значение = " + Double.MAX_VALUE);

        System.out.println();

        System.out.println("5.Вывод символов и их кодов");
        int p = 35;
        int pp = 38;
        int ppp = 64;
        int pppp = 94;
        int ppppp = 95;
        System.out.println("35 это: " + (char) p +
                "\n 38 это: " + (char) pp +
                "\n 64 это: " + (char) ppp +
                "\n 94 это: " + (char) pppp +
                "\n 95 это: " + (char) ppppp);

        System.out.println();

        System.out.println("6.Произведение и сумма цифр числа");

        int num = 345;
        int sum = 0;
        int degree = 1;
        int currentDigit;

        currentDigit = num % 10;
        sum += currentDigit;
        degree = degree * currentDigit;

        num = num /10;
        currentDigit = num % 10;
        sum += currentDigit;
        degree = degree * currentDigit;

        num = num/10;
        sum += num;
        degree = degree * num;

        System.out.println("Сумма цифр числа 345 = " + sum);
        System.out.println("Произведение цифр числа 345 = " + degree);

        System.out.println();

        

    }
}
