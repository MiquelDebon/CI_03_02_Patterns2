package S3_02_N3_DependencyInjection;

public class SterlingPoundCurrency implements ForeignCurrency{

    private final double FACTOR = 1.15;

    @Override
    public double getFactor() {
        return FACTOR;
    }
}
