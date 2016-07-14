
public class main {
    public static void main(String []args) {
       //System.out.println("Hello World");
    	//Header Header1;
        //Sales Ticket Body
        //Sales Ticket Footer1
//	
    	System.out.println("莫绮静：");
    	System.out.println("第一种情况：");
    	new Header1(new Footer1(new SalesTicket())).prtTicket();
    	System.out.println("第二种情况：");
    	new Header2(new Header1(new Foot2(new SalesTicket()))).prtTicket();
    }
}
