package fileioteaching;

public class Apartment 
{
    private final double price;
    private final int sqft;
    private final int bedrooms;
    private final String link;
    private final String extras;

    public Apartment(double price, int sqft, int bedrooms, String link, String extras) 
    {
        this.price = price;
        this.sqft = sqft;
        this.bedrooms = bedrooms;
        this.link = link;
        this.extras = extras;
    }

    @Override
    public String toString() 
    {
        return "Apartment{" + "price=" + price + ", sqft=" + sqft + ", bedrooms=" + bedrooms + ", link=" + link + ", extras=" + extras + '}' +"\n";
    }
}
