
public class Header1 extends Decorator {  
  
    public Header1(Componet myComp) {  
        super(myComp);  
        // TODO Auto-generated constructor stub  
    }  
  
    @Override  
    public void prtTicket() {  
        // place the code of print the sales head  
        System.out.println("Sales Ticket Header1");  
        super.prtTicket();  
    }  
      
}  
