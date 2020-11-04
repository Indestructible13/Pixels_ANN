public class ANN {
    static Layer[] layers = new Layer[3];

    // default constructor
    public ANN() {}

    // constructor for other ANNs
    public ANN(Layer inputLayer, Layer hiddenLayer, Layer outputLayer) {
        layers[0] = inputLayer;
        layers[1] = hiddenLayer;
        layers[2] = outputLayer;
    }

    public static void helloWorld() {
        System.out.println("Hello World!");
    }
}
