package pricechart.model.util;

import org.jsoup.nodes.Element;

public class CoinUtil {
    public  static String getCoinName(Element element) {
	String name = element.select("td > div.tbl-currency > a").text();
	return name;
    }
    
    public static String getCoinId(Element element) {
	String id = element.attr("coin_id");
	return id;
    }
    
    public static Double getCoinPrice(Element element) {
	
	//get the elemet 1 (the price on array) and substring 1 (remove $) and remove (,)
	String priceS = element.select("td > span").get(1).text().substring(1).replaceFirst(",", "");
	Double price = Double.parseDouble(priceS);
	return price;
    }
    
    private static String coinPriceClassTag(Element element) {
	String initS = "tbl-price avgprice-";
	String id = getCoinId(element);
	String finalS = " price";
	
	String classTag = initS + id + finalS;
	return classTag;
    }
}
