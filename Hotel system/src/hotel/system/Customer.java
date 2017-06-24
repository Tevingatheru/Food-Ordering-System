package hotel.system;
public class Customer {
    private String name;
    private int custNo;
    Customer(){}

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
     * @return the custNo
     */
    public int getCustNo() {
        return custNo;
    }

    /**
     * @param custNo the custNo to set
     */
    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }
    
}
