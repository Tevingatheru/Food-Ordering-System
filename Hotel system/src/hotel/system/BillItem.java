package hotel.system;

import java.util.Scanner;

public class BillItem extends HotelSystem{
    
    private int sum;
    private int  order;
    
    BillItem(){
     sum=0;   
    }
    public void makeItem(int qty, int unit){
        sum=unit*qty;
    }
    /**
     * @param sum the sum to set
     */
    public void setSum(int unit,int qty) {
       
        this.sum = unit*qty;
        
    }

    /**
     * @return the order
     */
    public int getOrder() {
        return order;
    }
    /**
     * @return the sum
     */
    public int getSum() {
        return sum;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(int order) {
        this.order = order;
    }
}
