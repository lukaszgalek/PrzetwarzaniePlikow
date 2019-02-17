package SDA;

public class MinMaxResult {
    private int min;
    private int max;

    public MinMaxResult(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    @Override
    public String toString() {
        return "MinMaxResult{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }
    // dorzucić zmienne np minDate i tak przerobić porównanie
}
