package homework.Module11_Stack.task1;

/*Реализуйте класс стека для работы с целыми значениями (стек целых). Стек должен иметь фиксированный размер.
Реализуйте набор операций для работы со стеком:
■ помещение целого значения в стек,
■ выталкивание целого значения из стека,
■ подсчет количества целых в стеке,
■ проверку пустой ли стек,
■ проверку полный ли стек, ??
■ очистку стека,
■ получение значения без выталкивания верхнего целого в стеке.
При старте приложения нужно отобразить меню с помощью, которого пользователь может выбрать необходимую операцию.*/

import java.util.Scanner;
import java.util.Stack;

public class StackMain {

    Stack<Integer> integerStack = new Stack<>();
    Scanner scanner = new Scanner(System.in);
    final int sizeOfStack = 10;


    public static void main(String[] args) {

        StackMain stackMain = new StackMain();

        stackMain.menu();


    }
    public void menu(){
        integerStack.setSize(sizeOfStack);

        System.out.println("Welcome to Stack Menu");


        while (true){
            System.out.println("Choose the action (1-7)");
            switch (scanner.nextInt()){
                case 1: {
                    pushInStack();
                    break;
                }
                case 2: {
                    popFromStack();
                    break;
                }
                case 3:{
                    countStack();
                    break;
                }
                case 4: {
                    isEmpty();
                    break;
                }
                case 5: {
                    cleanStack();
                    break;
                }
                case 6: {
                    peekStack();
                    break;
                }
                case 7:{
                    printStack();
                }
                default: {
                    System.out.println("Choose the action (1-7)");
                }
            }
        }
    }

    public void pushInStack() {
        System.out.println("Enter number");
        integerStack.push(scanner.nextInt());
    }

    public void popFromStack() {
        System.out.println("Pop out " + integerStack.pop());
    }

    public void countStack(){
        System.out.println("Size " + integerStack.size());
    }

    public void isEmpty(){
        if (integerStack.isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Stack is not empty");
        }
    }

    public void cleanStack(){
        integerStack.clear();
        System.out.println("Clean done");
    }

    public void peekStack(){
        System.out.println("The last element in Stack is " + integerStack.peek());
    }

    public void printStack(){
        System.out.println(integerStack.toString());
    }
}
