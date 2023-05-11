package S3_02_N3_DependencyInjection;

public class ForeignCurrency {
    protected double factor;

    public ForeignCurrency(){
        this.factor = 1;
    }

    public double getFactor() {
        return factor;
    }


}
