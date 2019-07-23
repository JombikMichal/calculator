package operation;

public class Addition implements IOperation {

    // i need implements abstract method in interface
    @Override
    public double calculate(double left, double right) {
        return left + right;
    }
}
