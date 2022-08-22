package homework.Module9_PR5;

/*Create wrapper class objects using different approaches (constructors, literals).
* Create code that uses an xxxValue() method, a parseXxx() method, and a valueOf() method
*
* Создайте объекты класса-оболочки, используя различные подходы (конструкторы, литералы).
* Создайте код, который использует метод xxxValue(), метод parseXxx() и метод valueOf()*/

public class Task1 {
    public static void main(String[] args) {
       Integer integerNumber = new Integer(6);
       Double doubleNumber = 7.9;

        System.out.println("Objects output: " + integerNumber + ", " + doubleNumber);

        String a = "155";
        integerNumber = Integer.valueOf(a); //создание объекта Integer, инициализированного величиной, определенной в строковой переменной s
        System.out.println(integerNumber + doubleNumber);

        int i = doubleNumber.intValue(); //преобразование значения в тип int
        System.out.println(i);

        i = Integer.parseInt(a); //преобразование текстового значения в тип int
        System.out.println(i);
    }
}
