package S3_02_N3_DependencyInjection;

public class AmericanDollarCurrency implements ForeignCurrency{
    private final double FACTOR = 1.09;

    @Override
    public double getFactor() {
        return FACTOR;
    }
}
