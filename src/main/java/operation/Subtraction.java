package operation;

public class Subtraction implements IOperation {
    @Override
    public double calculate(double left, double right) {
        return left/right;
    }
}
