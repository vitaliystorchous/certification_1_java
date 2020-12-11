package primitive_data_types;

import org.junit.Test;

public class PrimitiveDataTypes {
    // целые числа
    byte myByte = 1; // from -128 to 127
    short myShort = 2; // from -32768 to 32767
    int myInt = 3; // from -2147483648 to 2147483647
    long myLong = 4; // from -9223372036854775808 to 9223372036854775807

    // числа с плавающей точкой
    float myFloat = 5.6f; // from 1.4e-45 to 3.4028235e38
    double myDouble = 7.8; // from 4.9e-324 to 1.7976931348623157e308

    // символы
    char myChar = 'A'; // one character only

    // логические значения
    boolean myBoolean = true;

    @Test
    public void printMyPrimitives() {
        System.out.println("My byte is " + myByte);
        System.out.println("My short is " + myShort);
        System.out.println("My int is " + myInt);
        System.out.println("My long is " + myLong);
        System.out.println("My float is " + myFloat);
        System.out.println("My double is " + myDouble);
        System.out.println("My char is " + myChar);
        System.out.println("My boolean is " + myBoolean);
    }

    @Test
    public void checkOperationsOverPrimitives() {
        System.out.println("Над целочисленными типами:");
        System.out.println("операторы сравнения (>, <, >=, <=) и равенства (==, !=)");
        System.out.println(myByte + " > 0 = " + (myByte > 0));
        System.out.println(myShort + " < 10 = " + (myShort < 10));
        System.out.println(myInt + " >= 3 = " + (myInt >= 3));
        System.out.println(myLong + " <= 20 = " + (myLong <= 20));

        System.out.println("\nунарные операторы (+, -)");
        System.out.println(myByte + " with unary operator - = " + -myByte);
        int negativeNum = -5;
        System.out.println(negativeNum + " with unary operator + = " + +negativeNum);

        System.out.println("\nмультипликативные (*, /, %) и аддитивные (+, -) операторы");
        System.out.println(myShort + " * 2 = " + (myShort * 2));
        System.out.println(myInt + " / 3 = " + (myInt / 3));
        System.out.println(myLong + " % 3 = " + (myLong % 3));
        System.out.println(myByte + " + 1 = " + (myByte + 1));
        System.out.println(myShort + " - 1 = " + (myShort - 1));

        System.out.println("\nинкремент (++) и декремент (--) в префиксной и постфиксной формах");
        System.out.println("++" + myInt + " = " + (++myInt));
        System.out.println(myInt + "++ = " + (myInt++));
        System.out.println("--" + myInt + " = " + (--myInt));
        System.out.println(myInt + "-- = " + (myInt--));

        System.out.println("\nзнаковые (>>, <<) и без знаковые (>>>) операторы сдвига");
        System.out.println(myLong + " >> 1 = " + (myLong >> 1));
        System.out.println(myLong + " << 2 = " + (myLong << 2));
        System.out.println(myLong + " >>> 3 = " + (myLong >>> 3));

        System.out.println("\nпобитовые операторы (~, &, ^, |)");
        System.out.println("~" + myByte + " = " + (~myByte));
        System.out.println(myShort + " & " + myInt + " = " + (myShort & myInt));
        System.out.println(myLong + " ^ " + myByte + " = " + (myLong ^ myByte));
        System.out.println(myShort + " | " + myInt + " = " + (myShort | myInt));

        System.out.println("\nусловный оператор (? : )");
        System.out.println(myInt != 0 ? myInt + " != 0" : myInt + " == 0");

        // Над числами с плавающей точкой можно проводить все те же операции,
        // что и с целыми числами, за исключением побитовых операторов и операторов сдвига.

        System.out.println("\nНад логическим типом:");
        System.out.println("операторы равенства (== и !=)");
        System.out.println(myBoolean + " == true =" + (myBoolean == true));
        System.out.println(myBoolean + " != true = " + (myBoolean != true));

        System.out.println("\nлогические операторы (!,&, |, ^)");
        System.out.println("!" + myBoolean + " = " + (!myBoolean));
        System.out.println(myBoolean + " & false = " + (myBoolean & false));
        System.out.println(myBoolean + " | false = " + (myBoolean | false));
        System.out.println(myBoolean + " ^ false = " + (myBoolean ^ false));

        System.out.println("\nусловные логические операторы (&&, ||)");
        System.out.println(myBoolean + " && false = " + (myBoolean && false));
        System.out.println(myBoolean + " || false = " + (myBoolean || false));

        System.out.println("\nусловный оператор (? : )");
        System.out.println(myBoolean ? myBoolean + " = true" : myBoolean + " = false");
    }
}
