import java.util.Random;
import java.util.RandomAccess;

public class MathStuff {
    // Return the sigmoid
    public static double sigmoid() {
        return 1;
    }

    public static double[] createRandomArrayOfWeights(int arrayLength) {
        double[] weights = new double[arrayLength];
        Random rand = new Random();

        for (int i = 0; i < arrayLength; i++) {
            weights[i] = rand.nextDouble() * 2 - 1; // Random double from -1 to 1
        }

        return weights;
    }
}
