package S3_02_N3_DependencyInjection;

public class Article {
    private String name;
    private final double euroValue;

    public Article (String name, double euroValue){
        this.name = name;
        this.euroValue = euroValue;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getEuroValue() {
        return euroValue;
    }

}
