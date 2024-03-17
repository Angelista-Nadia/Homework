public enum Profession {
    DIRECTOR(2.0),
    WORKER(1.2),
    HR(1.6);

    private final double coefficient;

    Profession(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }

}
