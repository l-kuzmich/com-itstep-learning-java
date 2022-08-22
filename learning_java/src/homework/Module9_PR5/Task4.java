package homework.Module9_PR5;

/*Create code that instantiates instances of two different numeric wrapper classes, adds the values of the two
* instances together, and then creates a third numeric wrapper instance whose value is the sum.
* Demonstrate that numeric wrapper classes are immutable
* Show a situation when new objects of wrapper classes are not created
*
* Создайте код, который создает экземпляры двух разных классов числовой оболочки, складывает значения двух
экземпляров вместе, а затем создает третий экземпляр числовой оболочки, значением которого является сумма*/

public class Task4 {
    public static void main(String[] args) {
        Integer intNum = 4;
        Double doubleNum = 5.6;

        Double sum = intNum + doubleNum;
        System.out.println(sum);
    }

}
