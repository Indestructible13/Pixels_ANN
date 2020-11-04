import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class GUI extends Application {
    private static Pane root = new Pane();

    public void start (Stage primaryStage) {
        // New training object
        // [0 1]
        // [1 0]
        // Bright
        Training case1 = new Training(0, 0, 1, 1, 0, 1, 0);

        // Create list of neurons from training case
        Neuron biasNeuron = new Neuron(case1.getBias());
        Neuron x1 = new Neuron(case1.getInput1());
        Neuron x2 = new Neuron(case1.getInput2());
        Neuron x3 = new Neuron(case1.getInput3());
        Neuron x4 = new Neuron(case1.getInput4());

        ArrayList<Neuron> inputNeuronList = new ArrayList<>();
        inputNeuronList.add(biasNeuron);
        inputNeuronList.add(x1);
        inputNeuronList.add(x2);
        inputNeuronList.add(x3);
        inputNeuronList.add(x4);

        // Create input layer from list of input neurons
        Layer case1InputLayer = new Layer(inputNeuronList);

        // Create hidden layer Neurons
        Neuron h1 = new Neuron();

        // Create new ANN
        ANN ann1 = new ANN();

//        primaryStage.setTitle("Pixels ANN");
//        primaryStage.setScene(new Scene(root, 750, 450));
//        primaryStage.show();
        Platform.exit();
    }
}
