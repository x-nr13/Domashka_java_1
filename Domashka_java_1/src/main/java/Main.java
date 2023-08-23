public class Main {
    public static void main(String[] args) {

        System.out.println("Задача номер: 1");

        char charValue = 'G';
        int intValue = 89;
        byte byteValue = 4;
        short shortValue = 56;
        float floatValue = 4.7333436f;
        double doubleValue = 4.355453532;
        long longValue = 12121;

        System.out.println("Примитивные типы");
        System.out.println("char: " + charValue);
        System.out.println("int: " + intValue);
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("long: " + longValue);

        Character charOne = charValue;
        Integer intNum = intValue;
        Byte byteNum = byteValue;
        Short shortNum = shortValue;
        Float floatNum = floatValue;
        Double doubleNum = doubleValue;
        Long longNum = longValue;

        System.out.println("Не примитивные типы");
        System.out.println("Character: " + charOne);
        System.out.println("Integer: " + intNum);
        System.out.println("Byte: " + byteNum);
        System.out.println("Short: " + shortNum);
        System.out.println("Float: " + floatNum);
        System.out.println("Double: " + doubleNum);
        System.out.println("Long: " + longNum);

        System.out.println("Задача номер: 2");

        int number = 345;
        System.out.print("Число " + number + " -> ");

        int num1 = number / 100;
        int num2 = (number / 10) % 10;
        int num3 = number % 10;

        System.out.print(num1+ ", " +num2+ ", " +num3);
        }
}

