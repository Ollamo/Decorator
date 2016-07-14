public class Footer1 extends Decorator {  
  
    public Footer1(Componet myComp) {  
        super(myComp);  
        // TODO Auto-generated constructor stub  
    }  
  
    @Override  
    public void prtTicket() {  
        super.prtTicket();  
        // place the code of print sales foot  
        System.out.println("Sales Ticket Footer1");  
    }  
  
}  
