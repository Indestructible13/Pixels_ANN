public class Neuron {
    private double activation_value;
    private double[] weights;

    // default constructor
    public Neuron() {}

    // constructor for input neurons
    public Neuron(double activation_value) {
        this.activation_value = activation_value;
        this.weights = null;
    }

    // constructor for hidden neurons and output neurons
    public Neuron(double[] weights) {
        this.weights = weights;
    }

    // Getters and Setters
    public double getActivation_value() {
        return activation_value;
    }

    public void setActivation_value(double activation_value) {
        this.activation_value = activation_value;
    }

    public double[] getWeights() {
        return weights;
    }

    public void setWeights(double[] weights) {
        this.weights = weights;
    }
}
