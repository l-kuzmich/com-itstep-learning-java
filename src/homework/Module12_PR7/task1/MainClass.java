package homework.Module12_PR7.task1;

/*Compare the efficiency of addition operation upon a primitive data type and its appropriate wrapper class.
Execute the operation 1 000 000 times. Hint: use System.currentTimeMillis() function to measure
the time of execution in milliseconds.

Сравните эффективность операции сложения для примитивного типа данных и соответствующего класса-оболочки.
Выполните операцию 1 000 000 раз. Подсказка: используйте функцию System.currentTimeMillis() для измерения
времени выполнения в миллисекундах.
*/
public class MainClass {
    public static void main(String[] args) {

        MainClass mainClass = new MainClass();
        long time = System.currentTimeMillis();
//        for (int i = 0; i < 1000000; i++) {
//            mainClass.intSum();
//        }
//        System.out.println((double)System.currentTimeMillis() - time); //1728-1896

        for (int i = 0; i < 1000000; i++) {
            mainClass.integerSum();
        }
        System.out.println((double) System.currentTimeMillis() - time); //1734-1910
    }

    public void intSum() {
        int a = 4;
        int b = 22;
        System.out.println(a + b);
    }

    public void integerSum() {
        Integer a = 4;
        Integer b = 22;
        System.out.println(a + b);
    }
}
