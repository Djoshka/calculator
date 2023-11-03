public class Sum implements Calculator {
int x;
int y;

    public Sum(int x, int y) {
        =x;


    }

    @Override
    public int calculate() {
        return x+y;
    }
}
