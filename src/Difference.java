public class Difference implements Calculator{
    int x;
    int y;

    public Difference(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int calculate() {
        return x-y;
    }
}
