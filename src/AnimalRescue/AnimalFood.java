package AnimalRescue;

public class AnimalFood {
    private String name;
    private int price;
    private int quantity;
    private int stockAvailability;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getStockAvailability() {
        return stockAvailability;
    }

    public void setStockAvailability(int stockAvailability) {
        this.stockAvailability = stockAvailability;
    }


    public void dryFood () {
        System.out.println ("biscuit or kibble");
    }

    public void wetFood () {
        System.out.println ("contain between 70 and 85% water, mixed in with the ‘dry’ ingredients");
    }
}


