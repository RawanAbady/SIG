


//class of sigHeader which store in it the invoice item lines, customer name, invoice number and date
package SIG.model;

import java.util.ArrayList;
 

/**
 *
 * @author ahmed
 */
public class MyHeader {
   private int num;
   private String date;
   private String name;
   private ArrayList<MyItem> items;

   
    public MyHeader() {
    }
  

    public MyHeader(int num, String name, String date) {
        this.num = num;
        this.name = name;
        this.date = date;
    }
    public double getTotalInvoice(){
        double total=0.0;
        for(MyItem item : getItems()){
            total= total + item.getTotalLine();
        }
        return total;
    }
   

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<MyItem> getItems() {
        if(items==null){
            items=new ArrayList();
        }
        return items;
    }

    @Override
    public String toString() {
        return "sigHeader{" + "num=" + num + ", date=" + date + ", name=" + name  + ", items=" + items + '}';
    }
    public double getTotal(){
        double total=0;
        for(MyItem item: getItems()){
            total= total+ item.getTotal();
        }
        return total;
    }

   public String getInvoicesFromTabel(){
       return num + "," + date + "," + name ;
   }
   

   
 
}
