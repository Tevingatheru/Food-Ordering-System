package hotel.system;
public class Food {
    private String name;
    private int UnitPrice;    
    Food(){    
//        Food chapati = new Food();
//        chapati.setName("Chapati");
//        chapati.setUnitPrice(20);        
//              
//        Food ugali = new Food();
//        ugali.setName("Beef");
//        ugali.setUnitPrice(120);        
//           
//        Food beef = new Food();
//        beef.setName("Ugali");
//        beef.setUnitPrice(100);
    }
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