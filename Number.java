public interface Number {

    public int toIntValue();
    public void fromIntValue(int value);

    default public void add(Number number) {
        this.fromIntValue(this.toIntValue() + number.toIntValue());
    }

    default public void subtract(Number number) {
        this.fromIntValue(this.toIntValue() - number.toIntValue());
    }

    default public void multiply(Number number) {
        this.fromIntValue(this.toIntValue() * number.toIntValue());
    }

    default public void divide(Number number) {
        this.fromIntValue(this.toIntValue() / number.toIntValue());
    }

}
