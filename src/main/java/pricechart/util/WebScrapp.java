package pricechart.util;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class WebScrapp {
    private static String chart = "https://widget.coinlib.io/widget?type=full_v2&graph=no";
    
    public static Document getPage() throws IOException {
	Document doc = Jsoup.connect(chart).userAgent("Monzilla/5.0").get();
	return doc;
    }
    
    public static Elements getCharts() throws IOException {
	Elements elements = getPage().select("tbody > tr");
	return elements;
    }
}
