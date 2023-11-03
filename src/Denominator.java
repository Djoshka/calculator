public class Denominator implements Calculator{
int a;
int b;

    public Denominator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculate() {
        return a/b;
    }
}
