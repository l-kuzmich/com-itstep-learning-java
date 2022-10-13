package homework.Module4;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task10 {
    static class Digit {
        String[] lines;
        public Digit(String... lines) {
            this.lines = lines;
        }
        public static Task10.Digit[] createDigits(String... lines) {
            int width = (lines[0].length() - 9 /* десять цифр => девять пробелов */) / 10;
            return IntStream
                    .range(0, 10)  // Stream из цифр 0-9
                    .mapToObj(digit ->
                            new Task10.Digit(Stream
                                    .of(lines)
                                    // цифры в line идут следующим образом:
                                    // `width` символов цифры `0`, пробел,
                                    // `width` символов цифры `1`, пробел,
                                    // ...
                                    .map(line -> line.substring(digit * (width + 1), (digit + 1) * (width + 1) - 1))
                                    .toArray(String[]::new))
                    ).toArray(Task10.Digit[]::new);
        }
    }

    public static void main(String[] args) {
        Task10.Digit[] digits = Task10.Digit.createDigits(
                "  ###      #     #####   #####  #       #######  #####  #######  #####   ##### ",
                " #   #    ##    #     # #     # #    #  #       #     # #    #  #     # #     #",
                "#     #  # #          #       # #    #  #       #           #   #     # #     #",
                "#     #    #     #####   #####  #    #  ######  ######     #     #####   ######",
                "#     #    #    #             # #######       # #     #   #     #     #       #",
                " #   #     #    #       #     #      #  #     # #     #   #     #     # #     #",
                "  ###    #####  #######  #####       #   #####   #####    #      #####   ##### "
        );
        int height = digits[0].lines.length;

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int countOfNumbers = 0;

        for (int i = number ; i != 0 ; i /= 10) {
            ++countOfNumbers;
        }

        int [] arrayOfNumbers = new int[countOfNumbers];

        for (int i = arrayOfNumbers.length - 1; i >= 0; i--) {
            int digit = number % 10;
            number /= 10;
            arrayOfNumbers[i] = digit;
        }

        for (int i = 0; i < height; i++) {
            for (int digit : arrayOfNumbers) {
                System.out.print(digits[digit].lines[i] + " ");
            }
            System.out.println();
        }
    }
}
