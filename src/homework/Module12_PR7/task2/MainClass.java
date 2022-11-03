package homework.Module12_PR7.task2;

/*Create a class called ConnectionManager that manages a fixed array of Connection objects.
The client programmer must not be able to create Connection objects, but only get them
via a static method in ConnectionManager.
ConnectionManager returns a null reference when it runs out of objects. Test the classes in main().

Class Connection has the next functionality:
-has a counter of instances
-automatically generates new id for a new connection
-has method toString()
-has method doSomething()

Создайте класс с именем ConnectionManager, который управляет фиксированным массивом объектов подключения.
Клиентский программист не должен иметь возможности создавать объекты подключения, а только получать их
с помощью статического метода в ConnectionManager. ConnectionManager возвращает нулевую ссылку, когда
у него заканчиваются объекты. Протестируйте классы в main().

ConnectionManager имеет следующую функциональность:
-имеет счетчик экземпляров
-автоматически генерирует новый идентификатор для нового соединения
-имеет метод toString()
-имеет метод doSomething()
*/

public class MainClass {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            ConnectionManager.getConnection(i);
        }
    }
}
