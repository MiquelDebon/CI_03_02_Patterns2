package S3_02_N3_DependencyInjection;

public class PakistaniRupeeCurrency implements ForeignCurrency{
    private final double FACTOR = 314.7;

    @Override
    public double getFactor() {
        return FACTOR;
    }
}
