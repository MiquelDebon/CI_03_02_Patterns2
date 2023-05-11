package S3_02_N3_DependencyInjection;

import java.util.ArrayList;

/*
Dissenya una classe que mostri en pantalla el preu de diversos articles. Ja que haurà de mostrar-los també en diversos tipus de moneda.

Assegura't d'afegir-li com a Injecció de Dependència una classe Convertidor de Moneda que efectuï la correcció del preu en funció del canvi de divisa.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Article> articlesList = new ArrayList<>();
        articlesList.add(new Article("Milk", 1.3));
        articlesList.add(new Article("Apple", 5));
        articlesList.add(new Article("Bread", 4));



        for(Article article : articlesList){
            System.out.println("🇪🇸 Spanish Euro: " + article.getEuroValue());
            System.out.println("🇬🇧 SterlingPound: " + article.getCurrencyPrice(new SterlingPoundCurrency()));
            System.out.println("🇺🇸 American Dollar: " + article.getCurrencyPrice(new AmericanDollarCurrency()));
            System.out.println("🇮🇳 Rupee currency: " + article.getCurrencyPrice(new PakistaniRupeeCurrency()));
            System.out.println();
        }


    }
}
