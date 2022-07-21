package Module2;

public class Task10 {
    public static void main(String[] args) {
        final int height = 169;
        final double weight = 68;
        double idealWeight = (height - 110) * 1.15;
        System.out.print("Your ideal weight is ");
        System.out.format("%.0f",idealWeight);
        System.out.println();

        if (Math.round(idealWeight) == weight){
            System.out.println("Your weight is ideal");
        }
        else if (Math.round(idealWeight) > weight){
            double gain = idealWeight - weight;
            System.out.println("You need to gain " + Math.round(gain) + " kg");
        }
        else if (Math.round(idealWeight) < weight){
            double lose = weight - idealWeight;
            System.out.println("You need to lose " + Math.round(lose) + " kg");
        }

    }
}
