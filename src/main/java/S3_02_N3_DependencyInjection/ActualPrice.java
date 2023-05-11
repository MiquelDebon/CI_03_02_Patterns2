package S3_02_N3_DependencyInjection;

public class ActualPrice {
    //@Inject
    ForeignCurrency foreignCurrency;
    Article article;

    public ActualPrice(Article article, ForeignCurrency foreignCurrency){
        this.article = article;
        this.foreignCurrency = foreignCurrency;
    }

    public double getActualPrice(){
        return (double) Math.round(article.getEuroValue() * foreignCurrency.getFactor()*100)/100;
    }

}
