package operation;

public class Multiplication implements IOperation {
    @Override
    public double calculate(double left, double right) {
        return left * right;
    }
}
