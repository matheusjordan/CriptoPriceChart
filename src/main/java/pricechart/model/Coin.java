package pricechart.model;

public class Coin {
    private String name;
    private Double value;
    
    protected Coin() {}
    
    public Coin(String name, Double value) {
	this.name = name;
	this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
