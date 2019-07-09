package hotel.system;

/*
*
*author: tevin
*/
import java.util.Scanner;

public class HotelSystem {

    public static void main(String[] args) {
        Waiter waiter1 = new Waiter();
        waiter1.setName("Sakatoshi");
        waiter1.setStaffNo(1);
        Waiter waiter2 = new Waiter();
        waiter2.setName("William");
        waiter2.setStaffNo(2);
        Waiter waiter3 = new Waiter();
        waiter3.setName("Merlin");
        waiter3.setStaffNo(3);
        System.out.println("Enter staffno :");
        System.out.println("Satoshi : 1");
        System.out.println("William : 2");
        System.out.println("Merlin : 3");
        Scanner waiterName = new Scanner(System.in);
        int WSel = waiterName.nextInt();
        String WName = " ";
        int WNo = 0;
        switch (WSel) {
            case 1:
                WName = waiter1.getName();
                WNo = waiter1.getStaffNo();
                break;
            case 2:
                WName = waiter2.getName();
                WNo = waiter2.getStaffNo();
                break;
            case 3:
                WName = waiter3.getName();
                WNo = waiter3.getStaffNo();
                break;
            default:
                break;
        }

        Food chapati = new Food();
        chapati.setName("Chapati   ");
        chapati.setUnitPrice(20);
        Food ugali = new Food();
        Food beef = new Food();

        ugali.setName("Beef      ");
        ugali.setUnitPrice(120);
        beef.setName("Ugali     ");
        beef.setUnitPrice(100);

        Scanner name = new Scanner(System.in);//scanner food
        Scanner no = new Scanner(System.in);// scanner qty
        int[] foodName = new int[10];//input food
        int k = 0;//incremental value
        String[] fName = new String[10];//get food
        int[] qty = new int[10];//input qty
        int[] unit = new int[10];//get unit
        System.out.println("K value : " + k);
        do {
            System.out.println("Enter yor order :");
            System.out.println("1. Chapati");
            System.out.println("2. Beef");
            System.out.println("3. Ugali");
            System.out.println("-1. finish order :");
            foodName[k] = name.nextInt();
            switch (foodName[k]) {
                case 1:
                    fName[k] = chapati.getName();
                    unit[k] = chapati.getUnitPrice();
                    break;
                case 2:
                    fName[k] = beef.getName();
                    unit[k] = beef.getUnitPrice();
                    break;
                case 3:
                    fName[k] = ugali.getName();
                    unit[k] = ugali.getUnitPrice();
                    break;
                case 0:
                    break;
            }

            if (foodName[k] > 0) {
                System.out.println("food entry : " + foodName[k]);
                System.out.println("Enter Quantity :");
                qty[k] = no.nextInt();
                System.out.println("qty value : " + qty[k]);
                System.out.println("K value : " + k);
                k++;
            }
            System.out.println("qty value : " + qty[k]);

        } while (foodName[k] >= 0);

        BillItem[] item = new BillItem[10];

        System.out.println("Staff :" + WName + "   No  :" + WNo);
        System.out.println("NO " + " Item " + "   Price " + " Qty " + " Amount ");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < k; i++) {
            int itemNo = i;
            item[i] = new BillItem();
            item[i].setSum(unit[i], qty[i]);
            item[i].setOrder(i + 1);
            System.out.println(item[i].getOrder() + "  " + fName[i]
                    + unit[i] + "    " + qty[i] + "     " + item[i].getSum());
        }
        System.out.print("TOTAL : ");
        int total = 0;

        for (int i = k - 1; i >= 0; i--) {

            total = total + item[i].getSum();
        }
        System.out.println(total);
    }
}
