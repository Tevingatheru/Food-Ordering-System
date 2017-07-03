package hotel.system;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class HotelSystem {
    
        public static void main(String[] args){
             Food chapati = new Food();
            chapati.setName("Chapati   ");
        chapati.setUnitPrice(20);
            Food ugali = new Food();
            Food beef = new Food();        
        ugali.setName("Beef      ");
        ugali.setUnitPrice(120);
        beef.setName("Ugali     ");
        beef.setUnitPrice(100);
            Waiter waiter1 = new Waiter();
              waiter1.setName("Sakatoshi");
            waiter1.setStaffNo(1);
            Waiter waiter2 = new Waiter();
              waiter2.setName("William");
            waiter2.setStaffNo(2);
            Waiter waiter3 = new Waiter();
              waiter3.setName("Merlin");
            waiter3.setStaffNo(3);
            Scanner name= new Scanner(System.in);//scanner food
    Scanner no= new Scanner(System.in);// scanner qty
        
        
        String[] fName=new String[10];//get food
        int[] qty=new int[10];//input qty
        int[] unit=new int[10];//get unit
                    int WNo=0;
         Scanner waiterName= new Scanner(System.in);//
         String WName=" ";
         ArrayList<Customer> cust=new ArrayList<Customer>();//=new ArrayList<>();
         String[] CName=new String[10];
         int[] CNo=new int[10];
         int[] session=new int[2];
         Scanner CNameIn= new Scanner(System.in);
         Customer[] setCust =new Customer[10] ;
         int s=0;//session index
          int c=0;///incrental cunstomer index
         
         
         
        do{
          System.out.println("Enter staffno :");
          int WSel= waiterName.nextInt(); 
            switch (WSel) {
                case 1:
                    WName= waiter1.getName();
                    WNo = waiter1.getStaffNo();
                    break;
                case 2:
                    WName= waiter2.getName();
                    WNo = waiter2.getStaffNo();
                    break;
                case 3:
                    WName= waiter3.getName();
                    WNo = waiter3.getStaffNo();
                    break;
                    }           
           do{
               setCust[c]=new Customer();               
               System.out.println("Enter customer Name :");
               CName[c] = CNameIn.nextLine();
               setCust[c].setName(CName[c]);
               CNo[c] = c+1;
               setCust[c].setCustNo(CNo[c]);
//               System.out.println("Customer Name :"+setCust[c].getName()+"  Customer ID :"+setCust[c].getCustNo());
               cust.add(setCust[c]);
               int k=0;//incremental order item value
               int[] foodName=new int[10];//input food
               do{    
                   
                   foodName[k]=0;
        System.out.println("Enter yor order :");
        System.out.println("1. Chapati");
        System.out.println("2. Beef");
        System.out.println("3. Ugali");
        System.out.println("-1. finish order :");
         foodName[k] = name.nextInt();
         switch(foodName[k]){
            case 1:              
       fName[k]=chapati.getName();
        unit[k]=chapati.getUnitPrice();      
                break;
            case 2:                 
        fName[k]=beef.getName();
        unit[k]=beef.getUnitPrice();        
                break;
            case 3:
         fName[k]=ugali.getName();
        unit[k]=ugali.getUnitPrice();
                break;
            }
        if(foodName[k] != -1){            
        System.out.println("Enter Quantity :");
        qty[k]=no.nextInt();
       k++;       
        }  
        }while( foodName[k]!=-1);
        BillItem[] item= new BillItem[10];
        System.out.println("Session"+s);
        System.out.println("Customer Name : "+CName[c]+"  No : "+CNo[c]);
        System.out.println("Staff :"+WName+"   No  :"+WNo);
        System.out.println("NO "+" Item "+"   Price "+" Qty "+" Amount ");
        System.out.println("---------------------------------------------");
        for(int i=k-1; i>=0;i--){            
                     item[i] = new BillItem();
                     item[i].setSum(unit[i],qty[i]);
                     item[i].setOrder(i+1);                     
                     System.out.println(item[i].getOrder()+"  "+fName[i]+
                                        unit[i]+"    "+qty[i]+"     "+item[i].getSum());
        }   
         System.out.print("TOTAL : ");
         int total=0;
         for(int i=k-1;i>=0;i--){            
            total=total+item[i].getSum();
        }System.out.println(total);
            c++;
           }while(c<CNo.length );
           s++;
        }while(s!=2);
      }
    }    