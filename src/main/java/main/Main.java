package main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("http://www.uji.es").get();
        System.out.println(doc);
        System.out.println("\n\n");
        Elements elements = doc.getElementsByClass("numbers");
        System.out.println(elements.get(0));
        System.out.println(elements.get(0).text());
        elements = doc.selectXpath("/html/body/main/div/div[2]/div/div/div[3]/span/text()");
        System.out.println("algo");
        System.out.println(elements.text());
        //System.out.println(elements.);


    }
}
