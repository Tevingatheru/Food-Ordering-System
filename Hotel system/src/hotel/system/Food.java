package hotel.system;
/*
*
*author: tevin
*/
public class Food {
    private String name;
    private int UnitPrice;    
    Food(){}
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the UnitPrice
     */
    public int getUnitPrice() {
        return UnitPrice;
    }

    /**
     * @param UnitPrice the UnitPrice to set
     */
    public void setUnitPrice(int UnitPrice) {
        this.UnitPrice = UnitPrice;
    }    
}