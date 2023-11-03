public class Multiplicator implements Calculator {
    int a;
    int b;

    public Multiplicator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculate() {
        return a*b;
    }
}
