public class Training {
    private double bias;
    private double input1;
    private double input2;
    private double input3;
    private double input4;
    private double output1;
    private double output2;

    Training() {}

    Training(double bias, double input1, double input2, double input3, double input4, double output1, double output2) {
        this.bias = bias;
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
        this.input4 = input4;
        this.output1 = output1;
        this.output2 = output2;
    }

    public double getBias() {
        return bias;
    }

    public void setBias(double bias) {
        this.bias = bias;
    }

    public double getInput1() {
        return input1;
    }

    public void setInput1(double input1) {
        this.input1 = input1;
    }

    public double getInput2() {
        return input2;
    }

    public void setInput2(double input2) {
        this.input2 = input2;
    }

    public double getInput3() {
        return input3;
    }

    public void setInput3(double input3) {
        this.input3 = input3;
    }

    public double getInput4() {
        return input4;
    }

    public void setInput4(double input4) {
        this.input4 = input4;
    }

    public double getOutput1() {
        return output1;
    }

    public void setOutput1(double output1) {
        this.output1 = output1;
    }

    public double getOutput2() {
        return output2;
    }

    public void setOutput2(double output2) {
        this.output2 = output2;
    }
}
