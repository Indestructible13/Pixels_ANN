import java.util.ArrayList;

public class Layer {
    ArrayList<Neuron> listOfNeurons = new ArrayList<>();

    // default constructor
    public Layer() {}

    // constructor for layers
    public Layer(ArrayList<Neuron> listOfNeurons) {
        this.listOfNeurons = listOfNeurons;
    }
}
